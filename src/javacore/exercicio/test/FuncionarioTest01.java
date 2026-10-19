package javacore.exercicio.test;

import javacore.exercicio.dominio.Funcionario;
import javacore.exercicio.dominio.ImpressoraDados;
import javacore.exercicio.dominio.Media;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraDados impressora = new ImpressoraDados();
        Media media = new Media();

        funcionario.setNome("Mauricio");
        funcionario.setIdade(25);
        funcionario.setSalario(new double[]{1650.24, 1324.15, 900.0, 300.0, 543.32, 5000.0});

        impressora.imprimeOsDados(funcionario);
        funcionario.imprimeMedia(funcionario);
    }

}
