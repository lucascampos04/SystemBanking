package Services.FormasDePagamentos;

import Services.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Ted {
    private String nomeCompleto;
    private String cpf;
    private String cnpj;
    private String banco;
    private String agenciaBancaria;
    private final String TIPO_CORRENTE = "Corrente";
    private final String TIPO_POUPANCA = "Poupança";
    Usuario users = new Usuario();
    public boolean validarDadosPessoais(String nomeCompleto, String cpf, String cnpj) {
        boolean nomeValido = nomeCompleto != null && !nomeCompleto.trim().isEmpty() && nomeCompleto.matches("^[A-Za-z]+( [A-Za-z]+)*$");
        boolean cpfValido = cpf != null && !cpf.trim().isEmpty() && cpf.matches("^[0-9]{11}$");
        boolean cnpjValido = cnpj != null && !cnpj.trim().isEmpty() && cnpj.matches("^[0-9]{14}$");

        if (nomeValido && cpfValido && cnpjValido){
            System.out.println("Dados válidos.");
            return true;
        } else {
            System.out.println("Dados inválidos.");
            return false;
        }
    }
}
