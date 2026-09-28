package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Cobalt";
        carro01.modelo = "Chevrolet";
        carro01.ano = 2019;

        Carro carro02 = new Carro();
        carro02.nome = "T-Cross";
        carro02.modelo = "Volkswagen";
        carro02.ano = 2025;


        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("------------------");

        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);

    }
}
