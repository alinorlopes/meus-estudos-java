package basejava;

import java.util.Scanner;

/*
 * Exercício 1:
 * Dada 3 notas, imprimir a média aritmética do aluno.
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        System.out.println("| Média Aritmérica |");

        Scanner scanner =  new Scanner (System.in); //Declaro o Scanner

        System.out.println("Insira sua primeira nota: ");
        float nota1 = scanner.nextFloat(); // declaro a nota 1, com o 'input'

        System.out.println("Insira sua segunda nota: ");
        float nota2 = scanner.nextFloat(); // declaro a nota 2, com o 'input'

        System.out.println("Insira sua segunda nota: ");
        float nota3 = scanner.nextFloat(); // declaro a nota 3, com o 'input'

        scanner.close(); // Fecho o Scanner, usei o mesmo scanner para as 3 notas. (Clean Code)

        float ValorTotal = (nota1 + nota2 + nota3) / 3; // Fórmula da Média
        System.out.printf("Suas notas inseridas são: %.1f, %.1f e %.1f. Sua média é %.2f" ,nota1 , nota2, nota3, ValorTotal);
        // Impressão da Média








    }
}

