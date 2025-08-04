package exercicios_decisao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        boolean ehPar;

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}
