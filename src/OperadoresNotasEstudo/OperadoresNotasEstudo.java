package OperadoresNotasEstudo;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        // Operações Aritméticas:

        //Soma
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        System.out.println("O resultado das somas é: " + soma);

        //Subtração
        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        System.out.println("O resultado da subtração é:" + subtracao);

        //Multiplicação
        int numero5 = 5;
        int numero6 = 6;
        int multiplicacao = numero5 * numero6;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);

        //Multiplicação em Decimal
        double numero7 = 5.2;
        double numero8 = 6.1;
        double multiplicacaoWDouble = numero8 * numero7;
        System.out.println("O resultado da Multiplicação em Decimal é:" + multiplicacaoWDouble);

        //Divisão
        int numero9 = 70;
        int numero10 = 10;
        int divisao = numero9 / numero10;
        System.out.println("O Resultado da divisão é: " + divisao);

        //Módulo
        int numero11 = 71;
        int numero12 = 7;
        int modulo = numero11 % numero12;
        System.out.println("O resto da divisão é: " + modulo);

        //Contador: Podemos usar "++" ao lado de uma variável para podermos somar 1, e "--" para diminuir 1

        int contador = 0;
        contador++;
        contador++;
        System.out.println("O contador é: " + contador);
        contador--;
        contador--;
        contador--;
        System.out.println("O contador agora é: " + contador);

        ///  /------------------------------------------------------/ ////

        //Operações Relacionas:

        // Maior ou Menor
        double decimal1 = 1.0;
        double decimal2= 2.0;
        boolean ehmaior = decimal1 > decimal2;
        System.out.println("1 é maior que 2? " + ehmaior);

        boolean ehmenor = decimal1 < decimal2;
        System.out.println("1 é menor que 2? " + ehmenor);

        //Maior ou igual que, Menor ou igual que, e Comparação, Diferença

        System.out.println(decimal1 >= decimal2);
        System.out.println(decimal1 <= decimal2);
        System.out.println(decimal1 == decimal2);
        System.out.println(decimal1 != decimal2);

        // Sistema de atribuição

        int variavel = 1;
        variavel += 4;
        variavel -= 2;
        variavel *= 5;
        variavel /= 3;
        variavel %= 2;
        System.out.println(variavel);

        // Operadores Lógicos
        int valor1 = 4;
        int valor2 = 2;
        boolean expressao = valor1 < 10 && valor2 < 10; //Se um dos valores der bool False, não irá imprimir
        System.out.println(expressao);

        int valor3 = 4;
        int valor4 = 2;
        boolean expressaoOr = valor3 < 10 || valor4 < 2; // Se uns dos dois valores for true, retornará true
        System.out.println(expressaoOr);

        boolean expressaoNegada = (2 < 1);
        System.out.println(!expressaoNegada);











    }
}
