import java.util.Scanner;

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcao = 0;

    while (opcao != 5) {
        System.out.println("-----Menu-----");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Listar contas");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Sair");
        System.out.println();

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                banco.conta(sc);
                break;

            case 2:
                banco.listar();
                break;

            case 3:
                banco.depositar(sc);
                break;

            case 4:
                banco.sacar(sc);
                break;
        }

    }
    sc.close();

}




