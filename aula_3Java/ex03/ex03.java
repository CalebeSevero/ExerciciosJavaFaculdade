/*3. (ExeRepeticao03) Crie um programa em Java que receba do usuário um número inteiro
        positivo e determine se ele é um “número perfeito”. Um número perfeito é aquele que é igual
        à soma dos seus divisores, exceto dele mesmo (ou seja, 0 e 1 não são números perfeitos).*/

package aula_3Java.ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n && soma != 0) {
            System.out.printf("%d é um numero perfeito", n);
        }else {
            System.out.printf("%d não é um numero perfeito", n);
        }

        sc.close();
    }
}
