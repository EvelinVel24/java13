package main;

import modelo.Auto;
import modelo.Bicicleta;

public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto(4, 4, "Rojo", "Sedán");
        Bicicleta miBicicleta = new Bicicleta(2, 0, "Montaña");

        miAuto.encender();
        miAuto.apagar();
        System.out.println(miAuto);
        System.out.println("Tipo de bencina: " + miAuto.tipoDeBencina());

        miBicicleta.encender();
        miBicicleta.apagar();
        System.out.println(miBicicleta);
    }
}
