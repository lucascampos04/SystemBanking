package Services;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
public class Logs {
    private List<Usuario> usuarios;

    public Logs(){
        this.usuarios = new ArrayList<>();
    }

    public void Login(String nome, String senha){
        boolean LoginSuccess = false;

        for (Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){
                LoginSuccess = true;
                break;
            }
        }

        if (LoginSuccess){
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Nome ou senha de usuario incorretos. Tente novamente!");
        }
    }

    public void CreateAccount(String nome, String senha, int idade){
        boolean isUsuarioExistente = false;
        for (Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome)){
                System.out.println("usuario existente");
                isUsuarioExistente = true;
                break;
            }
        }

        if (isUsuarioExistente){
            System.out.println("Usuario com o mesmo nome já existe. Escolha outro nome");
        } else{
            Usuario novoUsuario = new Usuario(nome, senha, idade);
            usuarios.add(novoUsuario);
            System.out.println("Conta criada com sucesso");
        }
    }

}
