import Services.Logs;
import lombok.extern.java.Log;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer escolha;

        System.out.println("Seja bem vindo ao Oliveira Bank!\n");
        System.out.println("====================================");
        System.out.println("+=========== OPÇÕES ===============+");
        System.out.println("|          [1] LOGIN               |");
        System.out.println("|          [2] Criar conta         |");
        System.out.println("|          [0] Sair                |");
        System.out.println("+==================================+");

        Logs logs = new Logs();

        do {
            System.out.println("Escolha : ");
            escolha = scan.nextInt();
            scan.nextLine();

            boolean isPerfilUser = false;

            switch (escolha) {
                case 1:
                    System.out.println("Usuario : ");
                    String nome = scan.next();

                    System.out.println("Senha : ");
                    String senha = scan.next();

                    boolean isLoginSuccess = logs.Login(nome, senha);

                    if (isLoginSuccess){
                        isPerfilUser = true;
                        perfil();
                    }


                    break;
                case 2:
                    System.out.println("Nome : ");
                    String nomeCreate = scan.next();

                    System.out.println("Idade : ");
                    String ageCreate = scan.next();

                    System.out.println("Senha : ");
                    String senhaCreate = scan.next();

                    logs.CreateAccount(nomeCreate, senhaCreate, Integer.parseInt(ageCreate));


                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inexistente");
                    break;
            }
        } while (escolha != 0);
    }

    public static String perfil(){
        System.out.println("PERFIL");
        return null;
    }

}
