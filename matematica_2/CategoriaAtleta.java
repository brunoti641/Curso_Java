package matematica_2;
import java.util.Scanner;
/*
 * Dada a idade do atleta, imprima sua categoria:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */
public class CategoriaAtleta {
  public static void main(String[] args) {
    categoria();
  }

  public static void categoria() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do atleta: ");
    String nome = scanner.nextLine();
    System.out.println("\nDigite a idade do atleta: ");
    int idade_atleta = scanner.nextInt();

    if (idade_atleta  >= 10 && idade_atleta <= 12){
        System.out.printf("\n%s é da categoria Mirin: 10 a 12 anos. ", nome);
    } 
    else if (idade_atleta >= 13 && idade_atleta <=15){
        System.out.printf("\n%s é da categoria Infantil: 13 a 15 anos. ", nome);
    } 
    else if (idade_atleta >= 16 && idade_atleta <=18){
        System.out.printf("\n%s é da categoria Juvenil: 16 a 18 anos ",nome);
    } 
    else{
       System.out.println("\nIdade fora das categorias definidas.");
    }

    scanner.close();
        
  
    
  }
}
