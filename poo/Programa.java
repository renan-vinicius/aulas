public class Programa {
    public static void main(String[] args) {
        Curso engcomp = new Curso("Engenharia da Computação", 3600);
        Aluno jose = new Aluno("José", 1234, engcomp);

        Disciplina poo = new Disciplina("POO", 64);
        Disciplina aed2 = new Disciplina("AED2", 64);

        float notasJose[] = new float[] { 7.0f, 2.0f, 10f };
        Matricula josePoo = new Matricula(jose, poo, notasJose);

        System.out.println("Nome: " + josePoo.getAluno().getNome());
        System.out.println("Média: " + josePoo.calcularMedia());
    }
}
