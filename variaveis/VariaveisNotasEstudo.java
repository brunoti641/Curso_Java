package variaveis;

/*
 * Aula prática sobre variáveis no Java.
 * As variáveis são conteiners de dados.
 */
public class VariaveisNotasEstudo {
    
    public static void main(String[] args){
        int dia = 31, mes = 07, ano = 2024;
        System.out.println("Dia: "  +dia+  "\nMês: "+mes+ "\nAno: "  +ano);
        metodo2();
    }

    public static void metodo2() {
        int dia2 = 18;
        int mes2 = 8;
        int ano2 = 2024;
        System.out.println("A data da prova do CNU será: "+dia2+ " do "+mes2+" de "+ano2);
    }
}
