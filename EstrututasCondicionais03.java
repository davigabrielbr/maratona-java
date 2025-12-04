package maratonajava.com.davi.introducao;

public class EstrututasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 6000;

        // Operador Ternário
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar!" : "Eu não vou doar!";

        System.out.println(resultado);
    }
}
