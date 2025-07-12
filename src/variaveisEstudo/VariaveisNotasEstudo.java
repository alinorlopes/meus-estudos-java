package variaveisEstudo;

/*
 * Aula prática sobre variáveis no Java.
 * As variáveis são conteiners de dados.
 */
public class VariaveisNotasEstudo {
  public static void main(String[] args) {
    // Variáveis que representam a data atual.
    int dia = 29;
    int mes = 04;
    int ano = 2023;

    // Atribuir novo valor para o dia.
    dia = 30;

    // Impressão da data atual.
    System.out.println(dia);
    System.out.println(mes);
    System.out.println(ano);
  }

  public static void outroMetodo(String[] args) {
    int dia = 31;
    System.out.println(dia);
  }
}
