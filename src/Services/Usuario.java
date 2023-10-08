package Services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Random;

@Data
@Getter
@Setter
public class Usuario {
    private String nome;
    private String senha;
    private int idade;
    private Double saldo;

    public Usuario(String nome, String senha, int idade) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
    }

    public Usuario(){
        Random random = new Random();
        double limiteInferior = 1000.0;
        double limiteSuperior = 5000.0;
        this.saldo = limiteInferior + (limiteSuperior - limiteInferior) * random.nextDouble();

    }

    public String getSaldoFormatado(){
        DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");
        return "R$" + formatoMoeda.format(saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getSaldo() {
        return saldo;
    }
}
