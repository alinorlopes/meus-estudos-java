package estruturaswitch;


import java.util.Scanner;

public class ChecadorDeNotas {
    public static void main(String[] args) {
        System.out.println("Informe suas notas (A, B, C, D, F)");

        Scanner scanner = new Scanner(System.in);
        String nota = scanner.nextLine();

        switch (nota) {
            case "A" -> System.out.println("Muito bem!");
            case "B" -> System.out.println("Bom!");
            case "C" -> System.out.println("Pode melhorar!");
            case "D" -> System.out.println("Abaixo da média!");
            case "F" -> System.out.println("Ruim!");
            default -> System.out.println("Nota inserida inválida.");
        }
    }
}
