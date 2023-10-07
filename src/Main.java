import Services.Logs;

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

        do {
            System.out.println("Escolha : ");
            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Usuario : ");
                    String nome = scan.next();

                    System.out.println("Senha : ");
                    String senha = scan.next();

                    Logs logs = new Logs();
                    logs.Login(nome, senha);

                    break;
                case 2:
                    System.out.println("Campo de criar conta");
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
}
