package modelo;

public abstract class Vehiculo {
    protected int numeroDeRuedas;
    protected int cantidadDeVentanas;

    public Vehiculo(int numeroDeRuedas, int cantidadDeVentanas) {
        this.numeroDeRuedas = numeroDeRuedas;
        this.cantidadDeVentanas = cantidadDeVentanas;
    }

    public abstract void encender();
    public abstract void apagar();
}
