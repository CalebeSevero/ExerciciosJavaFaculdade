import java.util.Scanner;

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o primeiro número:");
    int n1 = teclado.nextInt();
    System.out.println("digite o segundo número:");
    int n2 = teclado.nextInt();
    System.out.println("Digite o terceiro número:");
    int n3 = teclado.nextInt();
    int soma = n1+n2+n3;
    System.out.printf("A soma de %d + %d + %d é igual a %d%n", n1, n2, n3, soma);
}