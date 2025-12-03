package maratonajava.com.davi.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 21;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "Davi"; // String não é tipo primitivo, String é uma classe.

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}