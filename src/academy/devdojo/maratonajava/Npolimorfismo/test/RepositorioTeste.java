package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.Npolimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.Npolimorfismo.service.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();

        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();

        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");

        list1.add("Goku");
        list1.add("Vegeta");
        list1.add("Kuririn");

        System.out.println(list);
        System.out.println(list1);
    }
}