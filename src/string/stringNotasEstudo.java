package string;
/*
‘String’ é um tipo de referência que representa uma cadeia de caracteres.
 */

import java.util.Scanner;

public class stringNotasEstudo {
    public static void main(String[] args) {
        String texto = ("Texto para ser impresso.");
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in); // Declara um scanner

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine(); // Input do user

        System.out.println("Olá, Seu nome completo é: " + nomeCompleto); // Imprime a o nome inteiro

        Scanner scanner2 = new Scanner(System.in); //Declaramos um novo scanner
        System.out.println("Digite novamente seu nome completo: ");
        String nome = scanner2.next(); // input do user
        System.out.printf("Seu primeiro nome é: %s" ,nome); // Imprimimos a str com a contatenação do var nome

    }
}
