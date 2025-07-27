package basejava;

import java.util.Scanner;

/*
 * Programa que calcula descontos
 *
 * 1 - lê preço
 * 2 - lê desconto
 * 3 - imprime o valor com o desconto
 */

public class PrecoComDesconto {
    public static void main(String[] args) {
        System.out.println("| Calculadora de desconto |");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do produto: ");
        float preco = scanner.nextFloat();

        System.out.println("Insira o valor do desconto: ");
        float desconto = scanner.nextFloat();

        scanner.close();

        desconto = desconto / 100;

        float descontoaplicado = (preco * desconto);

        float precoFinal =  preco - descontoaplicado;

        System.out.printf("O produto com o desconto aplicado ficou por R$ %.2f" ,precoFinal);



    }
}
