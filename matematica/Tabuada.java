package matematica;

import java.util.Scanner;
/*
 * Imprimir a tabuada de um número.
 * 
 * 1. Ler um número
 * 2. Imprimir sua tabuada
 * 
 * 1 a 10 : 1 x 1 = 1, 1 x 2 = 2, ... 1 x 10 = 10.
 */

public class Tabuada {
    public static void main(String[] args) {
        Tabuada_multiplicacao();
    }

    public static void Tabuada_multiplicacao() {
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

        scanner.close();
    }
}
