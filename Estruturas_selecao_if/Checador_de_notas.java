package Estruturas_selecao_if;
import java.io.Console;

public class Checador_de_notas {
    public static void main(String[] args) {
    // A,B,C,D ou F
    Console console = System.console();
    
    System.out.println("Digite sua nota (A,B,C,D,F): ");
    String nota = console.readLine();

    /*switch(nota){
        case "A" -> System.out.println("Execente!");
        case "B" -> System.out.println("Bom trabalho!");
        case "C" -> System.out.println("Está progredindob!");
        case "D" -> System.out.println("Passou na média!");
        case "F" -> System.out.println("Reprovado!");
        default -> System.out.println("Opção inválida.");*/
    String mensagem = switch(nota){
        case "A" -> "Execente!";
        case "B" -> "Bom trabalho!";
        case "C" -> "Está progredindo!";
        case "D" -> "Passou na média!";
        case "F" -> "Reprovado!";
        default ->  "Opção inválida.";
    };
    System.out.println(mensagem);

    }

        
    }


