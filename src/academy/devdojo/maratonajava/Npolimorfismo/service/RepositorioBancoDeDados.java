package academy.devdojo.maratonajava.Npolimorfismo.service;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}