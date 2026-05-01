import java.util.Scanner;
import java.util.Date;
import static java.lang.StrictMath.PI;

void main() {
 /*1. (Lista1_01) Construa um algoritmo que leia (via teclado) dois números do tipo inteiro,
calcule o produto entre eles e mostre o resultado.*/

  /* Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o primeiro número:");
  int n1 = teclado.nextInt();
  System.out.println("Digite o segundo número:");
  int n2 = teclado.nextInt();
  int produto = n1*n2;
  System.out.printf("O produto de %d por %d é igual a %d%n", n1, n2, produto);*/

  /*2. (Lista1_02) Construa um algoritmo que leia (via teclado) três números do tipo inteiro,
calcule e mostre a soma deles.*/

/*  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o primeiro número:");
  int n1 = teclado.nextInt();
  System.out.println("digite o segundo número:");
  int n2 = teclado.nextInt();
  System.out.println("Digite o terceiro número:");
  int n3 = teclado.nextInt();
  int soma = n1+n2+n3;
  System.out.printf("A soma de %d + %d + %d é igual a %d%n", n1, n2, n3, soma);*/

  /*(Lista1_03) Construa um algoritmo para ler (via teclado) quatro números do tipo inteiro,
  calcular e mostrar a média aritmética entre eles.*/

  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o primeiro número:");
  int n1 = teclado.nextInt();
  System.out.println("digite o segundo número:");
  int n2 = teclado.nextInt();
  System.out.println("Digite o terceiro número:");
  int n3 = teclado.nextInt();
  System.out.println("Digite o quarto número:");
  int n4 = teclado.nextInt();
  double media = (n1 + n2 + n3 + n4) / 4.0;
  System.out.printf("A média aritmetica é: %.2f%n", media);

 /* (Lista1_04) Construa um algoritmo que leia um número e o guarde em uma variável X.
          Calcule e mostre: (1) o conteúdo de X, (2) o quadrado de X, (3) o resto da divisão inteira de X
  por 3, (4) a metade de X, e (5) o resultado do produto de X pela metade de X.*/

/*
  Scanner teclado = new Scanner(System.in);
  System.out.println("digite o número: ");
  int x = teclado.nextInt();
  System.out.printf("O conteúdo de X é: %d%n", x);
  int quadrado = x*x;
  System.out.printf("O quadrado é: %d%n", quadrado);
  int resto = x%3;
  System.out.printf("O resto da divisão inteira de X por 3 é: %d%n", resto);
  double metade = x/2.0;
  System.out.printf("A metade de %d é: %.1f%n", x, metade);
  int produto = (int) (x*metade);
  System.out.printf("O produto de %d pela metade de (%.1f) é: %d%n", x, metade, produto);
*/


  /*5. (Lista1_05) Construa um algoritmo para ler o raio de um círculo, calcular a área deste círculo
  e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)). Usar dados do tipo float
  para ter precisão nos resultados (%.2f)).*/


   /* Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número: ");
    double raio = teclado.nextInt();
    double area = (PI * (raio * raio));
    System.out.printf("A Área do círculo é: %.2f", area);*/

    /*6. (Lista1_06) Construa um algoritmo para ler uma temperatura em graus Fahrenheit, calcular
    e mostrar o valor correspondente em graus Celsius sabendo que TempCelsius = 5 x
            (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão nos resultados
    (%.1f)) */

   /*Scanner teclado = new Scanner(System.in);
    System.out.println("digite a temperatura: ");
    float fahrenheit = teclado.nextFloat();
    float celcius = 5*(fahrenheit-32)/9;
    System.out.printf("A temperatura em Celcius é: %.1f", celcius);*/


   /* 7. (Lista1_07) Construa um algoritmo que leia um comprimento em polegadas, calcule e
    mostre o comprimento correspondente em milímetros, considerando que 1 polegada
    equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão nos resultados
    (%.1f))*/

/*    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a medida: ");
    float polegadas = teclado.nextFloat();
    double milimetros = polegadas*25.4;
    System.out.printf("A medida em milímietros é: %.1f", milimetros);*/


  /*  8. (Lista1_08) Construa um programa que leia as horas, minutos e segundos em determinado
    momento do dia, calcule e mostre qual o total de segundos decorridos neste dia. (DICA:
    totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos)*/

   /* Scanner teclado = new Scanner(System.in);
    System.out.printf("Me fale as horas: ");
    int horas = teclado.nextInt();
    System.out.println("me fale os minutos");
    int minutos = teclado.nextInt();
    System.out.println("Me fale os segundos");
    int segundos = teclado.nextInt();
    int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
    System.out.println("O total de segundos que passaram é: " +totalSegundos);
*/

    /*9. (Lista1_09) Construa um programa para ler 3 valores os quais correspondem ao número de
    convidados para um churrasco, sendo homens, mulheres e crianças. Sabendo que, em média,
            um homem come 650 gramas de carne, uma mulher come 420 gramas de carne, e uma criança
    come 290 gramas de carne, calcule a quantidade de carne necessária para o churrasco em
    quilogramas e mostre o resultado.*/

    /*Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a quantidade de homens: ");
    int homens = teclado.nextInt();
    System.out.println("Digite a quantidade de mulheres: ");
    int mulheres = teclado.nextInt();
    System.out.println("Digite a quantidade de crianças: ");
    int criancas = teclado.nextInt();
    double totalcarne = ((homens*650)+(mulheres*420)+(criancas*290))/1000.0;
    System.out.printf("A quantidade de carne para o churrasco é: %.1fKg de carne.", totalcarne);

    teclado.close();
*/

}


