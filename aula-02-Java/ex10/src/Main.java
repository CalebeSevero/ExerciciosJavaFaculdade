import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      /*  10. (ExeSelecao10.java) Ler três valores para os lados de um triângulo: A, B e C. Verificar se
        os lados fornecidos formam realmente um triângulo. Se formar, deve ser indicado o tipo de
        triângulo: isósceles, escaleno ou equilátero.*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com os 3 lados do triangulo:");

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        System.out.println("Regra para formar um triangulo: (A < B + C) e (B < A + C) e (C < A + B)");

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)) {
            if (n1 == n2 && n2 == n3) {
                System.out.println("Os lados formam um triangulo EQUILATERO");
            }
            else if (n1 != n2 && n2 != n3 && n1 != n3) {
                System.out.println("Os lados formam um triangulo ESCALENO");
            }
            else {
                System.out.println("Os lados formam um triangulo ISÓSCELES");
            }
        }else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }

        teclado.close();
    }
}