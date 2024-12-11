package matematica;

import java.util.Scanner;

public class RelacionamentosDeOrdem_copy {
    public static void main(String[] args) {
        ordem();
    }

    public static void ordem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;
        boolean maior = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean maiorOuIgual = numero1 >= numero2;
        boolean menorOuIgual = numero1 <= numero2;
        
        System.out.println(numero1 + " == " + numero2 + " ? " + igual);
        System.out.println(numero1 + " != " + numero2 + " ? " + diferente);
        System.out.println(numero1 + " > " + numero2 + " ? " + maior);
        System.out.println(numero1 + " < " + numero2 + " ? " + menor);
        System.out.println(numero1 + " >= " + numero2 + " ? " + maiorOuIgual);
        System.out.println(numero1 + " <= " + numero2 + " ? " + menorOuIgual);
        
        scanner.close();
    }
}
