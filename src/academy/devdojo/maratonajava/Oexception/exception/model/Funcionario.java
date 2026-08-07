package academy.devdojo.maratonajava.Oexception.exception.model;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, RuntimeException {
        System.out.println("Salvando funcionário");
    }
}