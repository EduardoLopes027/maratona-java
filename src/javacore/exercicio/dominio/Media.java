package javacore.exercicio.dominio;

public class Media {
    public void imprimeMedia(Funcionario funcionario) {

        if(funcionario.salario == null)
            return;

        double media = 0;
        for (double salario : funcionario.salario) {
            media += salario;
        }

        media /= funcionario.salario.length;

        System.out.printf("Media: %.2f%n", media);
    }
}
