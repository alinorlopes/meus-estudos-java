package basejava;

import java.util.Scanner;

/*
 * Tabuada
 * 1 - Ler um número
 *  2- Imprimir sua tabuada
 */
public class Tabuada {
    public static void main(String[] args) {
        System.out.println("| Tabuada |");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número que quer ver a tabuada: ");

        int numeroTabuada = scanner.nextInt();

        int resultado;

        scanner.close();
        System.out.printf("Número escolhido foi: %d \n" ,numeroTabuada);

        System.out.printf("%d x 1 = %d \n" ,numeroTabuada, numeroTabuada);

        resultado = numeroTabuada * 2;
        System.out.printf("%d x 2 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 3;
        System.out.printf("%d x 3 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 4;
        System.out.printf("%d x 4 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 5;
        System.out.printf("%d x 5 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 6;
        System.out.printf("%d x 6 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 7;
        System.out.printf("%d x 7 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 8;
        System.out.printf("%d x 8 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 9;
        System.out.printf("%d x 9 = %d \n" ,numeroTabuada, resultado);

        resultado = numeroTabuada * 10;
        System.out.printf("%d x 10 = %d \n" ,numeroTabuada, resultado);
    }
}
