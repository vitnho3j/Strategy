import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CepTest {

    @Test
    public void deveCalcularFreteNormal(){
        Cep cep = new Cep();
        cep.calcularDistanciaFreteNormal(20);
        assertEquals(35, cep.getDistancia());
    }
    @Test
    public void deveCalcularFreteSedex(){
        Cep cep = new Cep();
        cep.calcularDistanciaFreteSedex(20);
        assertEquals(41, cep.getDistancia());
    }
    @Test
    public void naoDeveCalcularFreteNormalComDistanciaZero(){
        try{
            Cep cep = new Cep();
            cep.calcularDistanciaFreteNormal(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Distância Inválida", e.getMessage());
        }
    }
    @Test
    public void naoDeveCalcularFreteNormalComDistanciaAbaixoDeZero(){
        try{
            Cep cep = new Cep();
            cep.calcularDistanciaFreteNormal(-1);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Distância Inválida", e.getMessage());
        }
    }
    @Test
    public void naoDeveCalcularFreteSedexComDistanciaZero(){
        try{
            Cep cep = new Cep();
            cep.calcularDistanciaFreteSedex(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Distância Inválida", e.getMessage());
        }
    }
    @Test
    public void naoDeveCalcularFreteSedexComDistanciaAbaixoDeZero(){
        try{
            Cep cep = new Cep();
            cep.calcularDistanciaFreteSedex(-1);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Distância Inválida", e.getMessage());
        }
    }

}
