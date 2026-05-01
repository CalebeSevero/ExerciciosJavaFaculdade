/*4. (ExeRepeticao04) Ler uma quantidade indeterminada de duplas de valores (2 valores de
cada vez). Escrever para cada dupla lida uma mensagem que indique se ela foi informada em
ordem crescente ou decrescente. A repetição será encerrada ao ser fornecido valores iguais
para os elementos da dupla.*/

package aula_3Java.ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        while (A != B) {
               if (A < B) {
                   System.out.println("Crescente.");
               } else {
                   System.out.println("Decrescente.");
               }
               A = sc.nextInt();
               B = sc.nextInt();
        }

        sc.close();
    }
}
