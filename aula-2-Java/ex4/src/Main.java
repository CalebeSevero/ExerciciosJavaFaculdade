import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros");

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        if (n1<n2) {
            System.out.println(n1 + " eh o < dos numeros digitados");
        }
        else {
            System.out.println(n2 + " eh o < dos numeros digitados");
        }
        teclado.close();
    }
}