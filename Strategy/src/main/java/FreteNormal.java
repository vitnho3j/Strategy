public class FreteNormal implements Frete{

    public double calcular(double distancia){
        if (distancia == 0 || distancia < 0){
            throw new IllegalArgumentException("Distância Inválida");
        }
        else {
            return distancia * 1.25 + 10;
        }
    }

}
