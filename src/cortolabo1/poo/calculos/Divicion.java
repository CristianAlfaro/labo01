
package cortolabo1.poo.calculos;

public class Divicion implements calculo{
    @Override
    public float resultado(float factor1, float factor2){
        float Producto;
        Producto = factor1 + factor2;
        //System.out.println(Producto);
        return Producto;
    }
}
