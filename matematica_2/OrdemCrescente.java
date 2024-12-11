package matematica_2;
import java.util.Scanner;
/*
 * Leia 3 números e imprima-os em ordem crescente.
 */
public class OrdemCrescente {
  public static void main(String[] args) {
      metodo_ordem();
  }

  public static void metodo_ordem() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite três números:");
      int numero1 = scanner.nextInt(), numero2 = scanner.nextInt(), numero3 = scanner.nextInt();
      System.out.println("\nOs números na ordem crescente são: ");

      if (numero1 < numero2 && numero1 < numero3){
          System.out.println(numero1);
          if (numero2 < numero3)
            System.out.printf("%d\n%d: ", numero2, numero3);
          else
            System.out.printf("%d\n%d: ", numero3, numero2);
    } else if (numero2 < numero1 && numero2 < numero3){
          System.out.println(numero2);
          if (numero1 < numero3)
            System.out.printf("%d\n%d: ",numero1, numero3);
          else
            System.out.printf("%d\n%d: ", numero3, numero1);
    } else if (numero3 < numero1 && numero3 < numero2){
            System.out.println(numero3);
          if (numero2 < numero1)
            System.out.printf("%d\n%d: ",numero2, numero1);
          else
            System.out.printf("%d\n%d: ", numero1, numero2);
    } 
            
      scanner.close();
          
  }
}
