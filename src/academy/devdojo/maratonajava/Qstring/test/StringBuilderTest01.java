package academy.devdojo.maratonajava.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        nome.substring(0, 3);

        StringBuffer sb = new StringBuffer("Willian Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}