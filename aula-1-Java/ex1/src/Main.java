import java.util.Scanner;

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o primeiro número:");
    int n1 = teclado.nextInt();
    System.out.println("Digite o segundo número:");
    int n2 = teclado.nextInt();
    int produto = n1*n2;
    System.out.printf("O produto de %d por %d é igual a %d%n", n1, n2, produto);
}