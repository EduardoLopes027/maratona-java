package javacore.exercicio.dominio;

public class ImpressoraDados {

    public void imprimeOsDados(Funcionario funcionario){
        System.out.println("Nome: "+funcionario.nome);
        System.out.println("Idade: "+funcionario.idade);

        if(funcionario.salario == null)
            return;

        int i = 1;
        for(double salario: funcionario.salario){
            System.out.println("Salario "+ i + ": "+ salario);
            i++;
        }
    }
}
