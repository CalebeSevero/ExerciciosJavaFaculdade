import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("digite o número: ");
    int x = teclado.nextInt();
    System.out.printf("O conteúdo de X é: %d%n", x);
    int quadrado = x*x;
    System.out.printf("O quadrado é: %d%n", quadrado);
    int resto = x%3;
    System.out.printf("O resto da divisão inteira de X por 3 é: %d%n", resto);
    double metade = x/2.0;
    System.out.printf("A metade de %d é: %.1f%n", x, metade);
    int produto = (int) (x*metade);
    System.out.printf("O produto de %d pela metade de (%.1f) é: %d%n", x, metade, produto);

}