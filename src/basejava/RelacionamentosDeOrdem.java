package basejava;

import java.util.Scanner;

/*
 * Programa que informa o relaciomento entre dois números
 * 1 - Ler 2 números
 * 2 - Imprimir os relacionamentos entre eles
 */



public class RelacionamentosDeOrdem {
    public static void main(String[] args) {

        System.out.println("Relaciomento de Ordem!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        boolean maiorque = numero1 > numero2;
        boolean menorque = numero1 < numero2;
        boolean igualque = numero1 == numero2;
        boolean diferenteque = numero1 != numero2;

        System.out.printf("%d é maior que %d? \n", numero1, numero2 );
        System.out.println(maiorque);

        System.out.printf("%d é menor que %d? \n", numero1, numero2 );
        System.out.println(menorque);

        System.out.printf("%d é igual a %d? \n", numero1, numero2 );
        System.out.println(igualque);

        System.out.printf("%d é diferente de %d? \n", numero1, numero2 );
        System.out.println(diferenteque);



    }
}
