package basejava;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("| Calculador me média de estoque |");

        System.out.println("Digite a quantidade mínima de uma peça: ");
        int quantidadeMin = scanner.nextInt();

        System.out.println("Digite a quantidade máxima dessa peça: ");
        int quantidadeMax= scanner.nextInt();

        scanner.close();

        int mediaDoEstoque = (quantidadeMin + quantidadeMax) / 2;
        System.out.println("A média de produtos no estoque é de: " + mediaDoEstoque);

    }
}
