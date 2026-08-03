package academy.devdojo.maratonajava.Npolimorfismo.service;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}