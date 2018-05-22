
package cortolabo1.poo;

import cortolabo1.poo.calculos.calculo;
import cortolabo1.poo.conversiones.conversiones;

public interface CalculadoraAbstract {
    calculo getCalculo(String type);
    conversiones getConversiones(String type);   
}
