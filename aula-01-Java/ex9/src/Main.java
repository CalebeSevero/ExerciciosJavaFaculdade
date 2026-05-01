import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de homens: ");
    int homens = teclado.nextInt();
    System.out.println("Digite a quantidade de mulheres: ");
    int mulheres = teclado.nextInt();
    System.out.println("Digite a quantidade de crianças: ");
    int criancas = teclado.nextInt();
    double totalcarne = ((homens*650)+(mulheres*420)+(criancas*290))/1000.0;
    System.out.printf("A quantidade de carne para o churrasco é: %.1fKg de carne.", totalcarne);

    teclado.close();

}