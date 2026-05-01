import java.util.Scanner;

public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);
    System.out.printf("Me fale as horas: ");
    int horas = teclado.nextInt();
    System.out.println("me fale os minutos");
    int minutos = teclado.nextInt();
    System.out.println("Me fale os segundos");
    int segundos = teclado.nextInt();
    int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
    System.out.println("O total de segundos que passaram é: " +totalSegundos);

}