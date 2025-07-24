package io;

import java.util.Scanner;

public class ioNotasEstudoJava {
    public static void main(String[] args) {
        /*
        Entrada e saída de dados (I/O) de dados no Java.
        Entra de dados: Ler dados digitados pelo usuário.
        Saída de dados: Escrever dados para o usuário.
         */


        //Leitura de dados de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite mu número: ");
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

        //Saída de dados
        System.out.printf("Você digitou o número %d", valorDigitado);

        // Especificadores de formato para System.out.printf():

// Numéricos:
        // %d – inteiro decimal (ex: int)
        // %f – ponto flutuante decimal (ex: float, double)
        // %e – notação científica (ex: 1.23e+03)
        // %x – hexadecimal (ex: 255 vira ff)
        // %o – octal
        // %n – nova linha (igual \n, mas mais portável)

// Texto:
        // %s – string (ex: "Olá")
        // %c – caractere (ex: 'A')

// Booleano:
        // %b – true ou false (qualquer coisa diferente de null ou false imprime true)

// Geral:
        // %% – imprime um % literal
        // %n – quebra de linha (recomendada em vez de \n, pois funciona em todos os SOs)

    }
}
