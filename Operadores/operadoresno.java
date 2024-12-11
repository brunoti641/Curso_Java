package Operadores;

public class operadoresno {
    public static void main(String[] args) {
        aritiméticos();
            relacionais();
            atribuidores();
                logicos();
    }

    public static void aritiméticos() {
        // +: adição//
        /*
         * int numero1 = 06;
         * int numero2 = 04;
         * int numero3 = 2001;
         */
        int numero1 = 06, numero2 = 04, numero3 = 2001;
        int soma = numero1 + numero2 + numero3;
        /*
         * System.out.println(" O resultado da soma dos três números é: " + (numero1 +
         * numero2 + numero3));
         */
        System.out.println("O resultado da soma dos três números é: " + soma);
        // -: Subtração//

        /*
         * int numero4 = 10;
         * int numero5 = 29;
         */
        int numero4 = 10, numero5 = 29;
        int Subtracao = numero4 - numero5;
        System.out.println("O resultado da subtração dos números é: " + Subtracao);
        /* *: Multiplicação */
        /*
         * int numero6 = 18;
         * int numero7 = 8;
         * int numero8 = 2024;
         */
        int numero6 = 18, numero7 = 8, numero8 = 2024;
        int Multiplicação = numero6 * numero7 * numero8;
        System.out.println("O resultado da multiplicação: " + Multiplicação);
        float numero9 = 6.40f;
        double numero10 = 6.90;
        double multiplicação2 = numero9 * numero10;
        System.out.println("O resultado da segunda multiplicação é: " + multiplicação2);
        // /: Divisão //
        /*
         * int numero11 = 100;
         * int numero12 = 10;
         */
        int numero11 = 100, numero12 = 10, Divisão = numero11 / numero12;
        // int Divisão = numero11 / numero12;//
        // System.out.println("O resultado da divisão do números é: " + Divisão);
        int modulo = numero11 % numero12;
        System.out.println("O resultado da divisão do números é: " + Divisão
                + "\nO resultado do módulo dos numeros é: " + modulo);
        int contador = 1;
        contador++;
        System.out.println("O resultado da soma do contador é: " + contador);
        contador = contador - 1;
        System.out.println("O resultado da subtração do coontador é: " + contador);

    }

    public static void relacionais() {
        // >: Maior que e // <: Menor que
        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean ehmaior = decimal1 > decimal2, ehmenor = decimal1 < decimal2;
        //System.out.printf("%b %b\n", ehmaior, ehmenor);
        System.out.println("Eh maior?: " + ehmaior + ", Eh menor?: " + ehmenor);
        boolean ehigual = decimal1 == decimal2;
        boolean maiorouigual = decimal1>=decimal2, menorouigual = decimal1 <= decimal2;
        boolean ehdiferente = decimal1 != decimal2;        
        System.out.println("Os números decimais tem valores iguais?: " + ehigual+"\nO decimal 1 é maior ou igual ao decimal 2?: "+maiorouigual+
        "\nO decimal 1 é menor ou igual ao decimal 2?: "+menorouigual+ "\nOs decimais tem valores diferentes?: "+ehdiferente);

    }

    public static void atribuidores() {
        int variavel = 1;
        System.out.println("\nResultado dos atribuidores: ");
        
        variavel = 1; // redefinir antes de cada operação
        int soma = variavel += 4;
        System.out.println("\nSoma: " + soma);

        variavel = 1; // redefinir antes de cada operação
        int subtracao = variavel -= 1;
        System.out.println("Subtração: " + subtracao);

        variavel = 1; // redefinir antes de cada operação
        int multiplicacao = variavel *= 5;
        System.out.println("Multiplicação: " + multiplicacao);

        variavel = 1; // redefinir antes de cada operação
        int divisao = variavel /= -1;
        System.out.println("Divisão: " + divisao);

        variavel = 1; // redefinir antes de cada operação
        int modulo = variavel %= 1;
        System.out.println("Módulo: " + modulo);
        
    }

    public static void logicos() {

        int valor1 = 46, valor2 = 59;
        System.out.println("\nResultado das expressões lógicas: ");
        boolean expressãoAND = valor1 < 10 && valor2 < 2;
        boolean expressãoor = valor1 < 10 || valor2 < 2;
        boolean expressaonegada = (!(valor1< valor2));
        String Resultado = "\nExpressão E OR ADN: " + expressãoAND+ "\nExpressão or: " 
        + expressãoor + "\nExpressão negada: "+ expressaonegada; 
        System.out.println(Resultado);
    }

}
