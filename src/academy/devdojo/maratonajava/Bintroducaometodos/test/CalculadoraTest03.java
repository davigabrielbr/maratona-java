package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros(20, 0));
        System.out.println(calculadora.divideDoisNumeros02(20, 0));

        System.out.println("---------------");

        calculadora.imprimeDivisaoDeDoisNumeros(20, 0);
    }
}