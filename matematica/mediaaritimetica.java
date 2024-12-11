package matematica;

import java.util.Scanner;

public class mediaaritimetica {
    public static void main(String[] args) {
        media();
    }

    public static void media() {
        // Calculando a média aritmética do aluno:

        //Identificando o nome do aluno:
        System.out.println("Digite o nome do aluno:");
        Scanner scanner = new Scanner(System.in);
        String nome_do_aluno = scanner.nextLine();

        // identificando as notas do aluno:
        String texto = "Digite as notas do aluno: ";
        System.out.println(texto);

        //Calculando a média aritimética:
        double nota1 = scanner.nextDouble(), nota2 = scanner.nextDouble(), nota3 = scanner.nextDouble();
        double media1 = (nota1 + nota2 + nota3) / 3;
        
        //Mostrando o resultado da média aritimética do aluno:
        System.out.printf("A média aritimética de %s foi: %.2f", nome_do_aluno, media1);
        scanner.close();
        

        
    }
}
