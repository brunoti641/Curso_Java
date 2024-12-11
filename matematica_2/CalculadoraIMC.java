package matematica_2;
import java.util.Scanner;
/*
 * Crie uma calculadora de IMC que mostra em que classificação a
 * pessoa está:
 * 
 * Menor que 18,5    -> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 e 29,9   -> SOBREPESO
 * Entre 30 e 39,9   -> OBESIDADE
 * Maior que 40      -> OBESIDADE GRAVE
 * 
 * IMC = peso / altura * altura
 * 
 */
public class CalculadoraIMC {
  public static void main(String[] args) {
    imc();
  }

  public static void imc() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu nome completo: ");
    String nome = scanner.nextLine();
    System.out.println("Digite o seu peso: ");
    double peso = scanner.nextDouble();
    System.out.println("Digite a sua altura:");
    double altura = scanner.nextDouble();
    

  }

}