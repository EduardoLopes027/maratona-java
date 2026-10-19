package javacore.exercicio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    public void imprimeMedia(Funcionario funcionario) {

        if(funcionario.getSalario() == null)
            return;

        for (double salario : funcionario.getSalario()) {
            media += salario;
        }

        media /= funcionario.getSalario().length;

        System.out.printf("Media: %.2f%n", getMedia());
    }

}



