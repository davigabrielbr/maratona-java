package maratonajava.com.davi.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 0;

        while (contador <= 10) {
            System.out.println("Dentro do while " + contador);
            contador++;
        }

        contador = 0;

        do { // Executa pelo menos uma vez, mesmo se a condição for falsa.
            System.out.println("Dentro do do-while " + contador);
            contador++;
        } while(contador <= 10);

        for (contador = 0; contador <= 10; contador++) {
            System.out.println("Dentro do for " + contador);
        }
    }
}