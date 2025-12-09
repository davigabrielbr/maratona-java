package maratonajava.com.davi.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char ´\u0000´ = ' '
        // boolean = false
        // String = null;

        String [] nomes = new String[4];
        nomes[0] = "Davi";
        nomes[1] = "Adrielly";
        nomes[2] = "Lucas";
        nomes[3] = "Emerson";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}