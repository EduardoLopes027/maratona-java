package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
