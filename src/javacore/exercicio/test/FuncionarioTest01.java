package javacore.exercicio.test;

import javacore.exercicio.dominio.Funcionario;
import javacore.exercicio.dominio.ImpressoraDados;
import javacore.exercicio.dominio.Media;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraDados impressora = new ImpressoraDados();
        Media media = new Media();

        funcionario.nome = "Mauricio";
        funcionario.idade = 25;
        //funcionario.salario = new double[]{1650.24, 1324.15, 900.0, 300.0};

        impressora.imprimeOsDados(funcionario);
        media.imprimeMedia(funcionario);
    }

}
