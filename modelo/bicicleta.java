package modelo;

public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(int numeroDeRuedas, int cantidadDeVentanas, String tipoBicicleta) {
        super(numeroDeRuedas, cantidadDeVentanas);
        this.tipoBicicleta = tipoBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void encender() {
        System.out.println("La bicicleta no necesita encenderse.");
    }

    @Override
    public void apagar() {
        System.out.println("La bicicleta no necesita apagarse.");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
               "tipoBicicleta='" + tipoBicicleta + '\'' +
               ", numeroDeRuedas=" + numeroDeRuedas +
               ", cantidadDeVentanas=" + cantidadDeVentanas +
               '}';
    }
}
