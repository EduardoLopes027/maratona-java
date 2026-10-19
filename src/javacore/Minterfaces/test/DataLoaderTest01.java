package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main() {
        DatabaseLoader databeseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databeseLoader.load();
        databeseLoader.remove();
        fileLoader.load();
        fileLoader.remove();
    }
}
