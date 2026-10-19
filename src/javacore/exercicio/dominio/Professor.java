package javacore.exercicio.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor: "+getNome());
        System.out.println("Especialidade: "+getEspecialidade());

        if(getSeminarios() == null) return;
        int i = 1;
        for (Seminario seminario : seminarios) {
            System.out.println("Seminário "+ i + ": "+seminario.getNome());
            System.out.println("Local: "+seminario.getLocal().getEndereco());

            i++;

            if(seminario.getAlunos() == null) continue;
            System.out.println("Lista de alunos: ");
            for (Aluno alunos : seminario.getAlunos()){
                System.out.println(alunos.getNome());
            }
        }




    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
