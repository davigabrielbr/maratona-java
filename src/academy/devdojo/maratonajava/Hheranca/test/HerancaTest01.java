package academy.devdojo.maratonajava.Hheranca.test;

import academy.devdojo.maratonajava.Hheranca.model.Endereco;
import academy.devdojo.maratonajava.Hheranca.model.Funcionario;
import academy.devdojo.maratonajava.Hheranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shinazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Luffy");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("---------------");
        funcionario.imprime();
    }
}