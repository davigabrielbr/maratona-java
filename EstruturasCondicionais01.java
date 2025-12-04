package maratonajava.com.davi.introducao;

import java.util.Scanner;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 15;
        boolean isIdade = idade >= 18;

        if (isIdade) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // !
        if (!isIdade) {
            System.out.println("Menor de idade");
        }
    }
}