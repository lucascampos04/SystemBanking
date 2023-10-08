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

    public void verificPagamentoPix(float valor){
        boolean pagPixSuccess = true;

            if (valor < 2.00){
                System.out.println("Valor mínimo: 2,00 R$");
                pagPixSuccess = false;
            }

            if (pagPixSuccess){
                System.out.println("Pagamento realizado com sucesso");
            } else{
                System.out.println("Erro: Transação Pix não encontrada ou valor inválido");
            }

        }

    }

