public class Cep {

    private double distancia;

    public double getDistancia(){
        return distancia;
    }

    public void calcularDistanciaFreteNormal(float distancia){

        Distancia frete = new Distancia(distancia);
        this.distancia = frete.calcular(new FreteNormal());

    }

    public void calcularDistanciaFreteSedex(float distancia){

        Distancia frete = new Distancia(distancia);
        this.distancia = frete.calcular(new FreteSedex());

    }

}
