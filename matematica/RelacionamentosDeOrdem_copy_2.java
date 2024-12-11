package matematica;

import java.util.Scanner;

public class RelacionamentosDeOrdem_copy_2 {
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
        
        StringBuilder resultado = new StringBuilder();
        resultado.append(numero1 + " == " + numero2 + " ? " + igual + "\n");
        resultado.append(numero1 + " != " + numero2 + " ? " + diferente + "\n");
        resultado.append(numero1 + " > " + numero2 + " ? " + maior + "\n");
        resultado.append(numero1 + " < " + numero2 + " ? " + menor + "\n");
        resultado.append(numero1 + " >= " + numero2 + " ? " + maiorOuIgual + "\n");
        resultado.append(numero1 + " <= " + numero2 + " ? " + menorOuIgual + "\n");
        
        System.out.print(resultado.toString());
        
        scanner.close();
    }
}
