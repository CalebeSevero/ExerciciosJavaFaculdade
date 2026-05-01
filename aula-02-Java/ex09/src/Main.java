import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Entre com o numero de eleitores");
        int eleitores = teclado.nextInt();

        System.out.println("Entre com o numero de votos brancos");
        int brancos = teclado.nextInt();

        System.out.println("Entre com o numero de votos nulos");
        int nulos = teclado.nextInt();

        System.out.println("Entre com o numero de votos validos");
        int validos = teclado.nextInt();

        double percBrancos = (brancos * 100.0) / eleitores;
        double percNulos = (nulos * 100.0) / eleitores;
        double percValidos = (validos * 100.0) / eleitores;

        System.out.println("Resultado:");
        System.out.printf("%.0f%% de votos brancos\n", percBrancos);
        System.out.printf("%.0f%% de votos nulos\n", percNulos);
        System.out.printf("%.0f%% de votos validos\n", percValidos);

        teclado.close();


    }
}
