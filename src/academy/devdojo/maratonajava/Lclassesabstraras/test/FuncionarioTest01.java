package academy.devdojo.maratonajava.Lclassesabstraras.test;

import academy.devdojo.maratonajava.Lclassesabstraras.model.Desenvolvedor;
import academy.devdojo.maratonajava.Lclassesabstraras.model.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}