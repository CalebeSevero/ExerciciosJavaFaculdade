import java.util.Scanner;

//6. (ExeSelecao06.java) Construa um programa para ler três valores que representam três
//segmentos de reta. Verificar se com esses segmentos é possível compor um triângulo e
//mostrar uma mensagem dizendo se é ou não possível.//

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite três numeros");

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)) {
            System.out.println("Os lados formam um triangulo");
        } else {
            System.out.println("Os lados não formam um triangulo");
        }

        teclado.close();
    }
}