package Npolimorfismo.service;

import Npolimorfismo.model.Produto;
import Npolimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relátorio de imposto");

        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
//            Tomate tomate = (Tomate) produto;
            String dataValidade = ((Tomate) produto).getDataValidade();
//            ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}