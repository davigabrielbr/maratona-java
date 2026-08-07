package academy.devdojo.maratonajava.Oexception.exception.model;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}