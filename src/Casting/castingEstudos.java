package Casting;

public class castingEstudos {
    public static void main(String[] args) {

        // Widening Casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        // Narrowing (Explícito)
        long variavelLong = 5233124122132141233l;
        int variavelInt2 = (int) variavelLong;
        System.out.println(variavelInt2);

        // Operações de divisão de números inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = (float) numero1 / numero2;
        System.out.println(resultadoDivisao);




    }
}
