import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.println("digite a temperatura: ");
    float fahrenheit = teclado.nextFloat();
    float celcius = 5*(fahrenheit-32)/9;
    System.out.printf("A temperatura em Celcius é: %.1f", celcius);
}