package Services.FormasDePagamentos;

public class Ted {
    private String nomeCompleto;
    private String cpf;
    private String cnpj;
    private String banco;
    private String agenciaBancaria;
    private final String TIPO_CORRENTE = "Corrente";
    private final String TIPO_POUPANCA = "Poupança";

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }

    public void setAgenciaBancaria(String agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }

    public String getTIPO_CORRENTE() {
        return TIPO_CORRENTE;
    }

    public String getTIPO_POUPANCA() {
        return TIPO_POUPANCA;
    }
}
