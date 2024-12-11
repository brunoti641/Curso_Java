package Tiposprimitivos;
public class TiposPrimitivosNotasEstudo2 {
    public static void main(String[] args) {
        // Caracteres ou Characters
        char Letrab = 'B';
        System.out.println("Letra: " + Letrab);

        // Tipos numéricos inteiros
        byte minha_idade = 23;
        short minha_quantia_de_dinheiro = 20000;
        int meudinheironaconta = 100000;
        long meupatrimonio = 900000000000000L;
        System.out.println("Minha idade: " + minha_idade + "\n" + 
                           "Minha quantia de dinheiro: " + minha_quantia_de_dinheiro + "\n" + 
                           "Meu dinheiro na conta: " + meudinheironaconta + "\n" + 
                           "Meu patrimônio: " + meupatrimonio);

        // Tipos numéricos de ponto flutuante
        float trocodepinga = 22.80F;
        double trocodebala = 22.99;
        System.out.println("Troco de pinga: " + trocodepinga + "\n" + 
                           "Troco de bala: " + trocodebala);

        // Tipos booleanos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Verdadeiro: " + verdadeiro + "\n" + 
                           "Falso: " + falso);
    }
}
