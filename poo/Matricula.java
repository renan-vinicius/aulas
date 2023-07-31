public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private float notas[];

    public Matricula(Aluno a, Disciplina d, float[] notas) {
        this.aluno = a;
        this.disciplina = d;
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno a) {
        this.aluno = a;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina d) {
        this.disciplina = d;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float calcularMedia() {
        float soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return soma / this.notas.length;
    }

}
