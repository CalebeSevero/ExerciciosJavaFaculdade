/*1. (ExeRepeticao01) Crie um programa em Java que receba do usuário um número inteiro
positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
digitado + o somatório dos pares e ímpares separadamente.*/

package aula_3Java.ex01;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int qtdPares = 0;
        int qtdImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                qtdPares++;        // Contar os pares
                somaPares += i;    // Somar
            } else {
                qtdImpares++;      // Contar os impares
                somaImpares += i;  // Somar
            }
        }

        System.out.println("--- RESULTADOS ---");
        System.out.println("Total de Pares: " + qtdPares);
        System.out.println("Total de Ímpares: " + qtdImpares);
        System.out.println("Soma dos Pares: " + somaPares);
        System.out.println("Soma dos Ímpares: " + somaImpares);

        sc.close();
    }
}


