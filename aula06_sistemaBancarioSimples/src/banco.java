import java.util.Scanner;

public class banco {

    static int[] contas = new int[5];
    static String[] nomes = new String[5];
    static double[] saldos = new double[5];
    static int contador = 0;

    public static void conta(Scanner sc) {
        if (contador < 5) { // verificar se ainda tem espaço
            System.out.print("Digite o número da conta: ");
            contas[contador] = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome do titular: ");
            nomes[contador] = sc.nextLine();

            System.out.print("Digite o saldo inicial: ");
            saldos[contador] = sc.nextDouble();

            contador++;
            System.out.println("Conta cadastrada com sucesso!");
            System.out.println();
        } else {
            System.out.println("Limite de 5 contas atingido!");
        }
    }

    public static void listar() {
        if (contador == 0) {
            System.out.println("Nenhuma conta cadastrada.");
            System.out.println();
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("-----CONTA " + (i + 1) + "-----");
            System.out.println("Conta: " + contas[i]);
            System.out.println("Titular: " + nomes[i]);
            System.out.printf("Saldo: %.2f", saldos[i]);
            System.out.println();
            System.out.println();
        }
    }

    public static void depositar(Scanner sc) {
        System.out.print("Digite o número da conta para deposito: ");
        int contaBusca = sc.nextInt();
        boolean encontrou = false;

        while (encontrou == false) {
            for (int i = 0; i < contador; i++) {
                if (contaBusca == contas[i]) {
                    encontrou = true;
                    System.out.print("Digite o valor para deposito: ");
                    saldos[i] = saldos[i] + sc.nextDouble();
                    System.out.printf("Saldo atualizado: %.2f", saldos[i]);
                    System.out.println();
                    System.out.println();
                    break;
                }

            }
            if (encontrou == false) {
                System.out.print("Conta inválida, digite o número da conta para deposito: ");
                contaBusca = sc.nextInt();
            }

        }
    }

    public static void sacar(Scanner sc) {
        System.out.print("Digite o número da conta para saque: ");
        int contaBusca = sc.nextInt();
        boolean encontrou = false;

        while (encontrou == false) {
            for (int i = 0; i < contador; i++) {
                if (contaBusca == contas[i]) {
                    encontrou = true;
                    System.out.print("Digite o valor para saque: ");
                    double saque = sc.nextDouble();

                    while (saque > saldos[i]) {
                        System.out.print("Saldo excedido, digite o valor para saque: ");
                        saque = sc.nextDouble();
                    }
                    saldos[i] = saldos[i] - saque;
                    System.out.printf("O Saldo atualizado: %.2f", saldos[i]);
                    System.out.println();
                    System.out.println();
                    break;
                }

            }

            if (encontrou == false) {
                System.out.print("Conta inválida, digite o número da conta para saque: ");
                contaBusca = sc.nextInt();
            }
        }

    }

}



