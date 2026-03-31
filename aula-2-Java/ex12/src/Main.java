/*
12. (ExeSelecao12.java) Produtos em uma mercearia possuem preços variados de acordo com
o tipo de produto e a quantidade a ser comprada. Implemente um programa que apresente a
lista de produtos disponíveis juntamente com seus preços e solicite ao usuário que escolha (1)
o produto a ser comprado e (2) a quantidade escolhida do produto e informe o valor da
compra. Os produtos e seus preços são: banana (R$ 0,30 se forem compradas menos do que
        uma dúzia, e R$ 0,25 se forem compradas pelo menos doze), laranja (R$ 0,40 se forem
compradas menos do que uma dúzia, e R$ 0,35 se forem compradas pelo menos doze), maçã
        (R$ 0,50 se forem compradas menos do que uma dúzia, e R$ 0,45 se forem compradas pelo
                menos doze), kiwi (R$ 0,40 se forem compradas menos do que uma dúzia, e R$ 0,30 se forem
compradas pelo menos doze). (DICA: utilizar “if-else” e “switch()” como estruturas de
seleção, e dados tipo “double” com duas casas decimais (%.2f) para a representação dos
preços a serem cobrados. Utilizar um único “printf()” para montar o menu de opções
conforme ilustração abaixo)//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String banana, Laranja, Maca, Kiwi;

        System.out.printf("""
                
                        ------ Lista de Produtos e Preços ------
                1. Banana  -> R$ 0.30 "preco granel" ou R$ 0.25 "preco duzia ou mais"
                2. Laranja -> R$ 0.40 "preco granel" ou R$ 0.35 "preco duzia ou mais"
                3. Maca    -> R$ 0.50 "preco granel" ou R$ 0.45 "preco duzia ou mais"
                4. Kiwi    -> R$ 0.40 "preco granel" ou R$ 0.30 "preco duzia ou mais"
                
                Escolha o "produto desejado" ou digite -1 para sair:
                """);

        int codigo = sc.nextInt();
        if (codigo == -1) {
            System.out.println("Operação finalizada!");
        } else {
            int quantidade;
            double precoUnitario;
            double total;

            switch (codigo) {
                case 1:
                    System.out.println("Escolha a quantidade de banana desejada:");
                    quantidade = sc.nextInt();

                    if (quantidade < 12) {
                        precoUnitario = 0.30;
                    } else {
                        precoUnitario = 0.25;
                    }
                    total = quantidade * precoUnitario;
                    System.out.println("------ Valor da Compra ------");
                    System.out.printf("%d unidade(s) de banana a R$ %.2f a unidade = %.2f%n", quantidade, precoUnitario, total);
                    break;

                case 2:
                    System.out.println("Escolha a quantidade de Laranja desejada:");
                    quantidade = sc.nextInt();

                    if (quantidade < 12) {
                        precoUnitario = 0.40;
                    } else {
                        precoUnitario = 0.35;
                    }
                    total = quantidade * precoUnitario;
                    System.out.println("------ Valor da Compra ------");
                    System.out.printf("%d unidade(s) de laranja a R$ %.2f a unidade = %.2f%n", quantidade, precoUnitario, total);
                    break;

                case 3:
                    System.out.println("Escolha a quantidade de maca desejada:");
                    quantidade = sc.nextInt();

                    if (quantidade < 12) {
                        precoUnitario = 0.50;
                    }else {
                        precoUnitario = 0.45;
                    }
                    total = quantidade * precoUnitario;
                    System.out.println("------ Valor da Compra ------");
                    System.out.printf("%d unidade(s) de maca a R$ %.2f a unidade = %.2f%n", quantidade, precoUnitario, total);
                    break;

                case 4:
                    System.out.println("Escolha a quantidade de Kiwi desejada:");
                    quantidade = sc.nextInt();

                    if (quantidade < 12) {
                        precoUnitario = 0.40;
                    } else {
                        precoUnitario = 0.30;
                    }
                    total = quantidade * precoUnitario;
                    System.out.println("------ Valor da Compra ------");
                    System.out.printf("%d unidade(s) de Kiwi a R$ %.2f a unidade = %.2f%n", quantidade, precoUnitario, total);
                    break;
            }
        }
        sc.close();
    }
}