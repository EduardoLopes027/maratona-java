package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main() {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Eduardo", 20000);
        System.out.println(desenvolvedor);
    }
}
