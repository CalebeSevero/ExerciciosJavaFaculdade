import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a medida: ");
    float polegadas = teclado.nextFloat();
    double milimetros = polegadas*25.4;
    System.out.printf("A medida em milímietros é: %.1f", milimetros);
}