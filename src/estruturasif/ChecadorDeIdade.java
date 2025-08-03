package estruturasif;

import java.util.Scanner;

public class ChecadorDeIdade {
    public static void main(String[] args) {
        System.out.println("Checador de idade");
        System.out.println("Digite sua idade: ");

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade >= 18) //Não precisei colocar chaves "{}" porque se refere somente a uma instrução (idade)
            System.out.println("Pode comprar o ingresso");
        else
            System.out.println("Esse filme é para maiores de 18 anos.");
        scanner.close();



    }
}
