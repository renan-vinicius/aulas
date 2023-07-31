public class Aluno {
    private String nome;
    private int rga;
    private Curso curso;

    public Aluno(String nome, int rga, Curso curso) {
        this.nome = nome;
        this.rga = rga;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRga() {
        return rga;
    }

    public void setRga(int rga) {
        this.rga = rga;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
