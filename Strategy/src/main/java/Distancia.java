public class Distancia {

    private double distancia;

    public Distancia(double distancia){
        this.distancia = distancia;
    }

    public double calcular(Frete frete){
        return frete.calcular(distancia);
    }

}
