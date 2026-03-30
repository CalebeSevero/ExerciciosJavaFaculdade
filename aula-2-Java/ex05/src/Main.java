import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");

        int numero = teclado.nextInt();

        if (numero > 100 && numero < 200) {
            System.out.println(numero +" está no intervalo (100, 200)");
        } else {
            System.out.println(numero + " não está no intervalo (100, 200)");
        }

        teclado.close();
    }
}