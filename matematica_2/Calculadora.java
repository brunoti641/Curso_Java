package matematica_2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        operadores();
    }

    public static void operadores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        System.out.println("\nDigite a operação desejada (+, -, *, /): ");
        String operacao1 = scanner.next();

        double resultado;

        switch (operacao1) {
            case "+":
                resultado = numero1 + numero2;
                System.out.printf("\n%.2f %s %.2f = %.2f", numero1, operacao1, numero2, resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.printf("\n%.2f %s %.2f = %.2f", numero1, operacao1, numero2, resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.printf("\n%.2f %s %.2f = %.2f", numero1, operacao1, numero2, resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("\n%.2f %s %.2f = %.2f", numero1, operacao1, numero2, resultado);
                } else {
                    System.out.println("A divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}

/*
 * package matematica_2;
 * import java.util.Scanner;
 * 
 * public class Calculadora {
 * public static void main(String[] args) {
 * operadores();
 * }
 * 
 * public static void operadores() {
 * Scanner scanner = new Scanner(System.in);
 * System.out.println("Digite dois números:");
 * double numero1 = scanner.nextDouble();
 * double numero2 = scanner.nextDouble();
 * 
 * // Criando variáveis para cada operação matemática com valores quebrados
 * double adicao = numero1 + numero2;
 * double subtracao = numero1 - numero2;
 * double multiplicacao = numero1 * numero2;
 * double divisao = 0;
 * if (numero2 != 0) {
 * divisao = numero1 / numero2;
 * }
 * 
 * System.out.println("Digite a operação desejada (+, -, *, /): ");
 * String operacao = scanner.next();
 * 
 * // Formatando a saída para mostrar com duas casas decimais
 * switch (operacao) {
 * case "+":
 * System.out.printf("Resultado: %.2f + %.2f = %.2f\n", numero1, numero2,
 * adicao);
 * break;
 * case "-":
 * System.out.printf("Resultado: %.2f - %.2f = %.2f\n", numero1, numero2,
 * subtracao);
 * break;
 * case "*":
 * System.out.printf("Resultado: %.2f * %.2f = %.2f\n", numero1, numero2,
 * multiplicacao);
 * break;
 * case "/":
 * if (numero2 != 0) {
 * System.out.printf("Resultado: %.2f / %.2f = %.2f\n", numero1, numero2,
 * divisao);
 * } else {
 * System.out.println("Divisão por zero não é permitida.");
 * }
 * break;
 * default:
 * System.out.println("Operação inválida.");
 * break;
 * }
 * }
 * }
 */