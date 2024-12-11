package matematica;
import java.util.Scanner;
/*
 * Faça um programa que converta um valor em dólar em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => O valor em reais é R$ 492,00.
 */
public class ConversorDolarReal {
    public static void main(String[] args) {
      conversor();
  }

    public static void conversor() {
    //Criando o objeto Scanner:
    Scanner scanner = new Scanner(System.in);

    // Identificando o valor em dolar:
    System.out.println("Digite o valor em dolar:");
    Double valordolar = scanner.nextDouble();
    
    // Identificando o valor da cotação:
    System.out.println("\nDigite o valor da cotação:");
    Double cotacao = scanner.nextDouble();

    // Fazendo a conversão dos valores e mostrando o resultado:
    Double valor_convertido = valordolar * cotacao;
    String resultado = String.format("\nO valor convertido em reais é: %.2f", valor_convertido);
    System.out.printf(resultado);
    scanner.close();

  }
}
