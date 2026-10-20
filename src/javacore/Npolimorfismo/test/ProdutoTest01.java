package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
