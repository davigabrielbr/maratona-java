package maratonajava.com.davi.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1 - 12 Meses
        // 31, 28 Dias
        int [] [] dias = new int[3] [3];

        dias [0] [0] = 1;
        dias [0] [1] = 1;
        dias [0] [2] = 1;

        dias [1] [0] = 2;
        dias [1] [1] = 2;
        dias [1] [2] = 2;

        dias [2] [0] = 3;
        dias [2] [1] = 3;
        dias [2] [2] = 3;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias [i] [j]);
            }
        }

        System.out.println("===================================");

        for (int [] array: dias) {
            for (int vetor: array) {
                System.out.println(vetor);
            }
        }
    }
}