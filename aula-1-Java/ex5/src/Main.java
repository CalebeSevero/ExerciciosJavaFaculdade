import java.util.Scanner;

import static java.lang.StrictMath.PI;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número: ");
    double raio = teclado.nextInt();
    double area = (PI * (raio * raio));
    System.out.printf("A Área do círculo é: %.2f", area);
}