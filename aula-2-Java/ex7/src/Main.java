import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*saidas possiveis: 1 2 3
                            1 3 2
                            2 1 3
                            2 3 1
                            3 1 2
                            3 2 1 */


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite três numeros inteiros");

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        if (n1 < n2 && n1 < n3) {  /* n1 é o menor*/
            if (n2 < n3) {
                System.out.println("Numeros em ordem crescente: " + n1 + " " + n2 + " " + n3);
            } else {
                System.out.println("Numeros em ordem crescente: " + n1 + " " + n3 + " " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {  /*  n2 é o menor*/
            if (n1 < n3) {
                System.out.println("Numeros em ordem crescente: " + n2 + " " + n1 + " " + n3);
            } else {
                System.out.println("Numeros em ordem crescente: " + n2 + " " + n3 + " " + n1);
            }
        } else if (n3 < n1 && n3 < n2) { /* n3 é o menor*/
            if (n1 < n2) {
                System.out.println("Numeros em ordem crescente: " + n3 + " " + n1 + " " + n2);
            } else {
                System.out.println("Numeros em ordem crescente: " + n3 + " " + n2 + " " + n1);
            }
        }
        teclado.close();
    }
}
