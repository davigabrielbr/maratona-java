package academy.devdojo.maratonajava.Npolimorfismo.service;

import academy.devdojo.maratonajava.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}