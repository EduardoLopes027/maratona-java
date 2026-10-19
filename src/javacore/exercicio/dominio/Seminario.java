package javacore.exercicio.dominio;

public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, Local local, Aluno[] alunos) {
        this.nome = nome;
        this.local = local;
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
