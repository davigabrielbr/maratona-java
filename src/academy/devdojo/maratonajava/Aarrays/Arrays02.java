package academy.devdojo.maratonajava.Aarrays;

public class Arrays02 {
    public static void main(String[] args) {
        // Padrão de inicialização
        // byte, short, int, long, float e double = 0
        // char = '\u0000' = ' '
        // boolean = false
        // String = null;

        String [] nomes = new String[3];

        nomes [0] = "Goku";
        nomes [1] = "Kurosaki";
        nomes [2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes [i]);
        }
    }
}