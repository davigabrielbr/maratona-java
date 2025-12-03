package maratonajava.com.davi.introducao;

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Davi";
        String endereco = "Rua amambai";
        String dataRecebimentoSalario = "04/07/2004";
        double salario = 5431.12;
        
        // Jogando a mensagem dentro de uma String
        String mensagem = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(mensagem);
    }
}