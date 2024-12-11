package io;

import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de um valor inteiro
        System.out.println("Digite um valor inteiro: ");
        int valorInteiro = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.printf("O número inteiro digitado foi %d\n", valorInteiro);

        // Leitura de um valor float
        System.out.println("Digite um valor float: ");
        float valorFloat = scanner.nextFloat();
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.printf("O número float digitado foi %.2f\n", valorFloat);

        // Leitura de uma letra
        System.out.println("Digite uma letra:");
        char letra = scanner.next().charAt(0);
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.printf("A letra digitada foi: %c\n", letra);

        // Leitura de uma palavra
        System.out.println("Digite uma palavra:");
        String palavra = scanner.next();
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.printf("A palavra digitada foi: %s\n", palavra);

        // Leitura de uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        System.out.printf("A frase digitada foi: %s\n", frase);

        // Leitura de um valor booleano
        System.out.println("Digite um valor booleano (true/false):");
        boolean valorBooleano = scanner.nextBoolean();
        System.out.printf("O valor booleano digitado foi: %b\n", valorBooleano);

        scanner.close();
    }
}