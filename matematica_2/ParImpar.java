package matematica_2;
import java.util.Scanner;
/*
 * Leia um número e imprima se ele é par ou ímpar.
 */
public class ParImpar {
  public static void main(String[] args) {
    Scanner  scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0)
      System.out.printf("%d é par:", numero);
    else
      System.out.printf("%d é ímpar:", numero);
    
    scanner.close();

  }
}
