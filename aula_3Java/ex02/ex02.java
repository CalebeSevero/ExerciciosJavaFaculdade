/*2. (ExeRepeticao02) Crie um programa em Java que receba do usuário dois números inteiros
positivos A e B (e garantindo que A < B), encontre e imprima os números divisíveis por 5 no
intervalo de números entre A e B (incluindo A e B) e a soma dos números encontrados.*/

package aula_3Java.ex02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = 0;

        while (A >= B) {
            System.out.println("A precisa ser menor que B:  ");
            A = sc.nextInt();
            B = sc.nextInt();
        }

        for (int i = A; i <= B; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println();
        System.out.printf("A soma dos numeros encontrados é: %d\n", soma);

    }

}
