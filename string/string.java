package string;

import java.util.Scanner;
    public class string {
            public static void main(String[] args) {
                string1();

        }
        public static void string1() {
            //Tipo utilizado para representar uma cadeia de caracteres, i.e., textos
            
            String texto ="Um texto a ser impresso.";
            System.out.println(texto);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu nome:");
            String nome = scanner.nextLine();
            String print = "Olá: " + nome;
            System.out.println(print);
            scanner.close();

            
        }
}
