package Services.FormasDePagamentos;

public class Pix {
    private String email;
    private String cpf;
    private String telefone;
    private String cnpj;
    private String chaveAleatoria;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getChaveAleatoria() {
        return chaveAleatoria;
    }

    public void setChaveAleatoria(String chaveAleatoria) {
        this.chaveAleatoria = chaveAleatoria;
    }
}
