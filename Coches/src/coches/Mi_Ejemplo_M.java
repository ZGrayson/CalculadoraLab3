/**
 * Ejercio: Ejercio de constructores (Mi ejemplo)
 * @author: Díaz García Zyanya Paola
 * @version:1.0
 * Fecha: 03/09/2017
 */
package coches;

public class Mi_Ejemplo_M 
{
    public static void main(String[] args) 
    {
        // SE MANDA A LLAMAR AL PRIMER MÉTODO (enviando parámetros)
        System.out.println("Cuando mis papás me dan buen dinero");
        Mi_Ejemplo TengoDinero = new Mi_Ejemplo(500);
        TengoDinero.compra();
       
        // SE MANDA A LLAMAR AL PRIMER METODO MÉTODO (enviando parámetros distintos)
        System.out.println("Cuando mis papás me dan solo el dinero suficiente");
        Mi_Ejemplo SuficienteDinero = new Mi_Ejemplo(350);
        SuficienteDinero.compra();
        
        // SE MANDA A LLAMAR AL PRIMER METODO MÉTODO (enviando parámetros distintos)
        System.out.println("Cuando mis papás me dan poco dinero");
        Mi_Ejemplo PocoDinero = new Mi_Ejemplo(200);
        PocoDinero.compra();
         
        // SE MANDA A LLAMAR AL SEGUNDO MÉTODO (sin enviar parámetros)
        System.out.println("Cuando mis papás no me dan dinero");
        Mi_Ejemplo SinDinero = new Mi_Ejemplo();
        SinDinero.compra();
    }
}
