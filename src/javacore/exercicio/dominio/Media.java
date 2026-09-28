package javacore.exercicio.dominio;

public class Media {
    public void imprimeMedia(Funcionario funcionario){
        double soma = funcionario.salario[0] + funcionario.salario[1] + funcionario.salario[2];
        double media = soma / 3;

        System.out.printf("Media: %.2f%n",media);
    }
}
