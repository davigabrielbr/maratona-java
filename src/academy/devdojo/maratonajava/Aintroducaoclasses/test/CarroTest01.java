package academy.devdojo.maratonajava.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "BMW";
        carro1.modelo = "X1";
        carro1.ano = 2026;

        carro2.nome = "AUDI";
        carro2.modelo = "Q3";
        carro2.ano = 2026;

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
