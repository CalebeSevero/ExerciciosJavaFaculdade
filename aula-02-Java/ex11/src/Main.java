//*
// 11. (ExeSelecao11.java) Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se
//forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//
//Escreva um algoritmo que leia o número de laranjas compradas, calcule e escreva o valor total
//da compra. Implementar uma validação da quantidade de frutas a serem compradas para
//evitar que seja lido um número de laranjas menor (negativo) ou igual a zero. (DICA: utilizar
//“if-else” como estrutura de seleção e dados tipo “double” com duas casas decimais (%.2f)
//para a representação dos preços a serem cobrados)*\\


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de laranjas a serem compradas: ");
        int qtdLaranjas = sc.nextInt();

        if (qtdLaranjas <= 0) {
            System.out.println("Nenhum item esta sendo comprado...");
        } else {
            double precoUnitario;
            if (qtdLaranjas < 12) {
                precoUnitario = 0.30;
            } else {
                precoUnitario = 0.25;
            }

            double valorTotal = qtdLaranjas * precoUnitario;

            System.out.println("--- Valor da compra ---");
            System.out.printf("%d unidade(s) a R$ %.2f cada = R$ %.2f%n", qtdLaranjas, precoUnitario, valorTotal);
        }
        sc.close();
    }
}