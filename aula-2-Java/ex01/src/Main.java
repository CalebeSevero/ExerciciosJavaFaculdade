import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro");

        int numero = teclado.nextInt();

        if (numero%2==0) {
            System.out.println("Numero lido eh par");
        }
        else {
            System.out.println("Numero lido eh impar");
        }

        teclado.close();


    }
}