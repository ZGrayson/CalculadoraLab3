/**
 * Ejercio: Ejercio de constructores (ejemplo)
 * @author: Díaz García Zyanya Paola
 * @version:1.0
 * Fecha: 03/09/2017
 */
package coches;

public class CocheMain 
{
    public static void main(String[] args) 
    {
        // SE MANDA A LLAMAR AL PRIMER MÉTODO (enviando parámetros)
        System.out.println("Cuando el carro tiene gasolina");
        carro GasolinaSi = new carro(2);
        GasolinaSi.arranca();
        
        // SE MANDA A LLAMAR AL SEGUNDO MÉTODO (sin enviar parámetros)
        System.out.println("Cuando el carro no tiene gasolina");
        carro GasolinaNo = new carro();
        GasolinaNo.arranca();
        
        // SE MANDA A LLAMAR AL PRIMER METODO MÉTODO (enviando parámetros distintos)
        System.out.println("Cuando el carro tiene poca gasolina");
        carro PocaGasolina = new carro(1);
        PocaGasolina.arranca();
    }
}
