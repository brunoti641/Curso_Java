package casting;

public class casting {
    public static void main(String[] args) {
        Widening_Casting();
        Narrowing_Casting();
        divisao_casting();
    }

    public static void Widening_Casting () {
        // Widening Casting (Implícito)
        byte variavelpequena = 1;
        int variavelgrande = variavelpequena;
        System.out.println(variavelgrande);
    }

    public static void Narrowing_Casting () {
        // Narrowing Casting (Explícito)
        long variavel_longa = 6554635455555555333L;
        int variavel_curta = (int) variavel_longa;
        System.out.println(variavel_curta);
    }

    public static void divisao_casting() {
        // Divisão entre números
        int number1 = 7, number2 = 2;
        //float number1 = 7;
        //float number2 = 2;
        float resultadodivisao = (float) number1/number2;
        //float resultadodivisao = number1/number2;
        System.out.println(resultadodivisao);
        
    }
}
    
