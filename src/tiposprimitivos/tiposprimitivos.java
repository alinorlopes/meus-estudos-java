package tiposprimitivos;

/*  Notas de estudo sobre os tipos primitivos do Java.
Tipos primitivos são providos pela linguagem nativamente.
 */
public class tiposprimitivos {
    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'G';
        char primeiraLetraDoNomeASCII = 71;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 até 127
        short itensComprados = 2; // -23768 até 32767
        int quantidadeEstoque = 23_666; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 755775457745354L; // 19 dígitos (Colocar 'L' no final do número.)

        // Tipos Decimais
        float peso = 1.5f;  // 6 - 7 casas decimais
        double preco = 24.99; // ~ 15 casas decimais (mais precisão)

        //Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false;
    }
}
