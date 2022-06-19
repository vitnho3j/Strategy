public class FreteSedex implements Frete{

    public double calcular(double distancia){
        if (distancia == 0 || distancia < 0){
            throw new IllegalArgumentException("Distância Inválida");
        }
        else {
            return distancia * 1.45 + 12;
        }
    }

}
