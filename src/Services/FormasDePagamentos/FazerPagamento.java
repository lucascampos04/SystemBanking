package Services.FormasDePagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.ErrorManager;

public class FazerPagamento {
    private List<Pix> pix;
    private List<Ted> ted;
    private Pix pixVerific;

    public FazerPagamento(){
        this.pix = new ArrayList<>();
        this.ted = new ArrayList<>();
    }

    public void verificPagamentoPix(String chave, double valor){
        boolean pagPixSuccess = false;

        for (Pix pixTransaction : pix){
            if (pixTransaction.getCpf().equals(chave)){
                pagPixSuccess = true;
                break;
            }

            if (pagPixSuccess){
                if (valor < 2.00){
                    System.out.println("Valor mínimo: 2,00 R$");
                } else {
                    System.out.println("Pagamento realizado com sucesso");
                }
            } else{
                System.out.println("Erro: Transação Pix não encontrada");
            }

        }

    }
}
