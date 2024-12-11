package matematica;

import java.util.Scanner;

public class diasdeidade {
    public static void main(String[] args) {
        dias();
    }
    
    public static void dias() {
        // Identificar o nome do usuário:
        System.out.println("Digite o seu nome: ");
        Scanner scanner = new Scanner (System.in);
        String nome = scanner.nextLine();

        //Identificar a idade do usuário:
        System.out.println("Digite a sua idade: ");
        int anos_de_idade = scanner.nextInt();

        // Calcular a quantidade de dias de idade do usuário:
        int dias_de_idade = anos_de_idade * 365;
        String resultado = nome+ " Você tem " + dias_de_idade +" de idade.";
        //Print do resultado:
        System.out.println(resultado);
        scanner.close();



        
    }
}
