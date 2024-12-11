package matematica;
import java.util.Scanner;
/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 */
public class EstoqueMedio {
  public static void main(String[] args) {
      media();
  }

  public static void media() {
      // Criando o objeto Scanner:
      Scanner scanner = new Scanner(System.in);

      // Identificando o produto:
      System.out.println("Digite a quantidade mínima do produto: ");
      int quantidade_Min = scanner.nextInt();
      System.out.println("Digite a quantidade máxima do produto: ");
      int quantidade_Max = scanner.nextInt();

      // Calculo da do estoque médio da peça:
      double calculo = (quantidade_Min + (double) quantidade_Max) / 2;
      
      // Resultado:
      String resultado = String.format("O estoque médio da peça é de: %.2f", calculo);
      System.out.printf(resultado);
      
      // Fechando o Scanner:
      scanner.close();


  }
}
