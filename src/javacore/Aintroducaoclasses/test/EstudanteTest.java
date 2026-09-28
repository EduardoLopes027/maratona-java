package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
   public static void main(String[] args) {
       Estudante estudante = new Estudante();
       estudante.nome = "Eduardo";
       estudante.idade = 20;
       estudante.sexo = 'M';

       System.out.println(estudante.nome);
       System.out.println(estudante.idade);
       System.out.println(estudante.sexo);
   }
}
