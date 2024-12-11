package matematica;
import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Ler preço
        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();
        
        // 2. Ler % de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = scanner.nextDouble();
        
        // Calcular novo preço e valor economizado
        double valorEconomizado = preco * (desconto / 100);
        double precoComDesconto = preco - valorEconomizado;
        
        // Usar StringBuilder para formatar a saída
        StringBuilder resultado = new StringBuilder();
        resultado.append(String.format("O preço com desconto é R$ %.2f\n", precoComDesconto));
        resultado.append(String.format("O valor economizado foi R$ %.2f\n", valorEconomizado));
        
        // 3. Imprimir resultado formatado
        System.out.print(resultado.toString());
        scanner.close();
    }
}
