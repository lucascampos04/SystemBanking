import Services.FormasDePagamentos.FazerPagamento;
import Services.Logs;
import Services.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer escolha;

        limparTerminal();

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

            switch (escolha) {
                case 1:
                    // Login
                    login(scan, logs);
                    break;
                case 2:
                    // Criar conta
                    criarConta(scan, logs);
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

    // Função para realizar o login
    public static void login(Scanner scan, Logs logs) {
        System.out.println("Usuario : ");
        String nome = scan.next();

        System.out.println("Senha : ");
        String senha = scan.next();

        boolean isLoginSuccess = logs.Login(nome, senha);

        if (isLoginSuccess) {
            perfil(nome, scan);
        }
    }

    // Função para criar uma conta
    public static void criarConta(Scanner scan, Logs logs) {
        System.out.println("Nome : ");
        String nomeCreate = scan.next();

        System.out.println("Idade : ");
        String ageCreate = scan.next();

        System.out.println("Senha : ");
        String senhaCreate = scan.next();

        logs.CreateAccount(nomeCreate, senhaCreate, Integer.parseInt(ageCreate));
    }

    // Perfil do usuário
    public static void perfil(String nome, Scanner scan) {
        Integer escolha;
        FazerPagamento pagamento = new FazerPagamento();

        System.out.println("Seja bem-vindo " + nome);
        Usuario saldo = new Usuario();
        System.out.println("Saldo : " + saldo.getSaldoFormatado());

        do {
            limparTerminal();

            System.out.println("+=========== OPÇÕES ===============+");
            System.out.println("|          [1] FAZER PAGAMENTO     |");
            System.out.println("|          [2] COMPRA AÇÃO         |");
            System.out.println("|          [0] Sair                |");
            System.out.println("|          [9] Realizar outro pagamento |");
            System.out.println("+==================================+");

            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    // Fazer pagamento
                    fazerPagamento(scan, nome, pagamento);
                    break;
                case 2:
                    // Compra de ação
                    break;
                case 0:
                    // saindo do perfil
                    System.out.println("Saindo do perfil.");
                    break;
                case 9:
                    // realizar outro pagamento
                    fazerPagamento(scan, nome, pagamento);
                    break;
                default:
                    System.out.println("Opção inexistente");
                    break;
            }
        } while (escolha != 0);
    }

    // Função para realizar um pagamento
    public static void fazerPagamento(Scanner scan, String nome, FazerPagamento pagamento) {
        System.out.println("[1] - Pix | [2] - Transferencia Bancaria | [3] - Boleto ");
        Integer escolha = scan.nextInt();
        scan.nextLine();

        String[] ChavesPix = {"CPF", "EMAIL", "CHAVE ALEATORIA", "CNPJ", "TELEFONE"};
        boolean continuar = true;

        if (escolha == 1) {
            do {
                System.out.println("Escolha uma chave pix : ");
                for (int i = 0; i < ChavesPix.length; i++) {
                    System.out.println("[" + (i + 1) + "] - " + ChavesPix[i]);
                }
                System.out.println("[0] - Sair");
                escolha = scan.nextInt();

                if (escolha >= 1 && escolha <= ChavesPix.length) {
                    String chaveEscolhida = ChavesPix[escolha - 1];
                    System.out.println("Valor : ");
                    Float valor = scan.nextFloat();

                    limparTerminal();

                    System.out.println("\n");
                    System.out.printf("Nome : %s\nChave : %s\nValor : %.3f ", nome, chaveEscolhida, valor);
                    pagamento.verificPagamentoPix(valor);

                    System.out.println("\nPressione [0] para sair");
                    System.out.println("Pressione [9] para realizar outro pagamento");

                    System.out.println("Escolha: ");
                    escolha = scan.nextInt();

                } else if (escolha == 0) {
                    continuar = false;
                }
            } while (continuar && escolha == 9);
        }
    }

    // Função para limpar o terminal
    public static void limparTerminal() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
