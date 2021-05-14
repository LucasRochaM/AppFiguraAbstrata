package appfiguracomclasseabstrata;

//import static java.lang.Math.*;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

   @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}


