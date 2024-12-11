package matematica;

import java.util.Scanner;
/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre dois números: 
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler 2 números
 * 2. Imprimir relacionamentos de ordem
 * 
 * Ex: Dados os números 2 e 3: 
 *  2 = 3 ? false, 2 != 3 ? true, ... , 2 <= 3 ? true
 */
public class RelacionamentosDeOrdem {
    public static void main(String[] args) {
        ordem();
    }

    public static void ordem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.println(numero1 + " = " + numero2 + " ? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));
        
        scanner.close();
    }
}
