package javacore.exercicio.test;

import javacore.exercicio.dominio.Aluno;
import javacore.exercicio.dominio.Local;
import javacore.exercicio.dominio.Professor;
import javacore.exercicio.dominio.Seminario;

public class SeminariosTest01 {
    public static void main(String[] args) {
      Local local1 = new Local("Tecnopuc");


        Aluno aluno1 = new Aluno("Marcelo", 43);
        Aluno aluno2 = new Aluno("Lucas", 18);
        Aluno aluno3 = new Aluno("Paulo", 26);
        Aluno[] alunos = {aluno1,aluno2,aluno3};
        Seminario seminario1 = new Seminario("Introdução ao Java", local1, alunos);
        Seminario seminario2 = new Seminario("Introdução ao Python", local1);
        Seminario seminario3 = new Seminario("Introdução ao C#", local1);
        aluno1.setSeminario(seminario1);
        Seminario[] seminarios = {seminario1, seminario2, seminario3};

      Professor professor1 = new Professor("Julio", "Java", seminarios);


      professor1.imprime();

    }
}
