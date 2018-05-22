
package cortolabo1.poo.conversiones;

public class binario implements conversiones{
    @Override
    public String coversion(int dato) {
       String Conver = "";
       while(dato >= 2){
           Conver= dato%2 + Conver;
           dato= dato/2; 
       } 

       return Conver;
    }
    
}
