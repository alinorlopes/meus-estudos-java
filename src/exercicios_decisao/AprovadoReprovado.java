package exercicios_decisao;
import java.util.Scanner;

/*
 * Ler 3 notas de um aluno e imprimir se ele foi aprovado ou não
 * Média 7,0
 */
public class AprovadoReprovado {
    public static void main(String[] args) {

        System.out.println("Sistema de Notas, Aprovado ou reprovado");
        System.out.println("\n Insira suas notas:  ");

        Scanner scanner = new Scanner(System.in); //Declaração do Scanner

        System.out.println("Insira sua primeira nota");
        float nota1 = scanner.nextFloat();
        System.out.println("Insira sua segunda nota");
        float nota2 = scanner.nextFloat();
        System.out.println("Insira sua terceira nota");
        float nota3 = scanner.nextFloat();

        scanner.close();

        float mediaDeNotas = (nota1 + nota2 + nota3) / 3;

        if (mediaDeNotas >= 7.0) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado");
        }
        System.out.printf("%.1f" ,mediaDeNotas);
    }
}
