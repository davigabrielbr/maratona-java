package maratonajava.com.davi.introducao;

import java.util.Scanner;

public class EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}