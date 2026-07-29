package academy.devdojo.maratonajava.Gassociacao.test;

import academy.devdojo.maratonajava.Gassociacao.model.Aluno;
import academy.devdojo.maratonajava.Gassociacao.model.Local;
import academy.devdojo.maratonajava.Gassociacao.model.ProfessorExercicio;
import academy.devdojo.maratonajava.Gassociacao.model.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Seminário");
        Aluno aluno = new Aluno("Davi", 22);
        ProfessorExercicio professorExercicio = new ProfessorExercicio("Rafael", "Tecnologia");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Seminário", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professorExercicio.setSeminarios(seminariosDisponiveis);

        professorExercicio.imprime();
    }
}