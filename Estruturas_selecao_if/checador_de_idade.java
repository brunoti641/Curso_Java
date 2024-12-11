package Estruturas_selecao_if;
import java.util.Scanner;

public class checador_de_idade {
    public static void main(String[] args) {
        checador();
    }

    public static void checador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        /*if (idade >= 18)
            System.out.println("Você pode assistir o filme.");
            
        else
            System.out.println("Esse filme é para maiores de 18 anos.");*/
        
        String mensagem = (idade>= 18) ? "Você pode assistir o filme. " : "Esse filme é para maiores de 18 anos!";
        System.out.println(mensagem);
        
        scanner.close();




}
    } 


