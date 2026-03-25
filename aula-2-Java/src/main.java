import java.util.Scanner;

void main() {

/*    1. (ExeSelecao01.java) Construa um programa para ler um valor, verificar se é maior do que
    100 e mostrar essa informação. (DICA: Usar if/else para mostrar se valor é > ou < 100)*/

    Scanner teclado = new Scanner(System.in);

    System.out.println("Entre com um numero inteiro: ");
    int numero = teclado.nextInt();
    //se o numero for maior que 100
    if (numero>100) {
        System.out.println("Numero lido eh maior que 100");
    }
    //para qualquer outro caso (menor ou igual a 100)
     else {
        System.out.println("Numero lido nao eh maior que 100");
     }

}