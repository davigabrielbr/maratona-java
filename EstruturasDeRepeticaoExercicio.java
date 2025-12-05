package maratonajava.com.davi.introducao;

public class EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        // Imprima os números pares de 0 até 50
        for (int i = 0; i < 50; i+=2) {
            System.out.println(i);
        }

        for (int i = 0; i < 50; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}