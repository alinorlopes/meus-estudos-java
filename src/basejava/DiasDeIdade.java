package basejava;

import java.util.Scanner;

/*
 * Programa que lê idade em anos e imprime essa idade em dias.
 * Exemplo: 1 ano = 365 dias
 */
public class DiasDeIdade {
    public static void main(String[] args) {
        System.out.println("Anos para Dias!");
        Scanner scanner = new Scanner(System.in); //Declaro meu Scanner

        System.out.println("Digite sua idade: ");
        int idadeAnos = scanner.nextInt(); // 'Input' do utilizador, scanner coleta

        scanner.close();

        int idadeDias = idadeAnos * 365;
        System.out.printf("Sua idade é %d anos, que significam %d dias!" ,idadeAnos, idadeDias);


    }
}
