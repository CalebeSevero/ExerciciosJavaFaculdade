/*5. (ExeRepeticao06) Escreva um programa em Java que receba um número e faça a tabuada
desse número de 1 a 10. Parar o algoritmo quando o usuário digitar um número negativo.*/

package aula_3Java.ex05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada do mesmo");
        int n = sc.nextInt();
        int tabuada = 0;

        while (n >= 0) {
            for (int i = 1; i <= 10; i++) {
                tabuada = i * n;
                System.out.println(n+ "x" + i +" = " +tabuada);
                }
            n = sc.nextInt();
        }


        sc.close();
    }
}
