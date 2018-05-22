/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortolabo1.poo.calculos;

/**
 *
 * @author LN710Q
 */
public class suma implements calculo{
    @Override
    public float resultado(float sumando1, float sumando2){
        float Suma;
        Suma = sumando1 + sumando2;
        //System.out.println(Suma);
        return Suma;
    }
  
}
