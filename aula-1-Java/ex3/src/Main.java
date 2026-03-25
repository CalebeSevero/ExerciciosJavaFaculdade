import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o primeiro número:");
    int n1 = teclado.nextInt();
    System.out.println("digite o segundo número:");
    int n2 = teclado.nextInt();
    System.out.println("Digite o terceiro número:");
    int n3 = teclado.nextInt();
    System.out.println("Digite o quarto número:");
    int n4 = teclado.nextInt();
    double media = (n1 + n2 + n3 + n4) / 4.0;
    System.out.printf("A média aritmetica é: %.2f%n", media);
}