/*2. (ExeSelecao02.java) Construa um programa para ler um valor, verificar se é par ou ímpar
e mostrar essa informação. (DICA: Usar if/else e o operador aritmético % para mostrar se
valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)*/


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero lido é par");
        }else {
            System.out.println("Numero lifo é ímpar");
        }
        sc.close();
    }
}