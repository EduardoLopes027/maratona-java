package javacore.exercicio.dominio;

public class ImpressoraDados {

    public void imprimeOsDados(Funcionario funcionario){
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Idade: "+funcionario.getIdade());

        if(funcionario.getSalario() == null)
            return;

        int i = 1;
        for(double salario: funcionario.getSalario()){
            System.out.println("Salario "+ i + ": "+ salario);
            i++;
        }
    }
}
