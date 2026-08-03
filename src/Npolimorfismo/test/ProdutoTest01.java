package Npolimorfismo.test;

import Npolimorfismo.model.Computador;
import Npolimorfismo.model.Tomate;
import Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoTomtate(tomate);
    }
}