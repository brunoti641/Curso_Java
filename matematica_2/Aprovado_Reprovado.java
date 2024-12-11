package matematica_2;
import java.util.Scanner;
/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */
public class Aprovado_Reprovado {
  public static void main(String[] args) {
        media();
  }
  public static void media() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite as suas três notas:");
    Double nota1 = scanner.nextDouble(), nota2 = scanner.nextDouble(), 
    nota3 = scanner.nextDouble();
    Double media1 = (nota1 + nota2 + nota3) / 3;

    if (media1 >= 7.0)
      System.out.println("Aprovado!: ");
    else
      System.out.println("Reprovado!:");
    
    scanner.close();


  }
}
