package academy.devdojo.maratonajava.Oexception.exception.test;

import academy.devdojo.maratonajava.Oexception.exception.model.Funcionario;
import academy.devdojo.maratonajava.Oexception.exception.model.LoginInvalidoException;
import academy.devdojo.maratonajava.Oexception.exception.model.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}