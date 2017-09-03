/**
 * Ejercio: Ejercio de constructores (ejemplo)
 * @author: Díaz García Zyanya Paola
 * @version:1.0
 * Fecha: 03/09/2017
 */
package coches;

public class carro 
{
    //Se inicializa una variable privada sin valor asignado
    private int gasolina=0;
    
    //Constructor que necesita recibir un parametro
    carro(int gasolina)
    {
        this.gasolina=gasolina;
    }
    
    //Constructor vacio que no necesita recibir un parametro
    carro()
    {
        
    }   
    
    //Método que verifica si el coche puede arrancar o no con la cantidad de gasolina que tiene.
    public void arranca()
    {
        switch(gasolina)
        {
            case 0:
                {System.out.println("No puede arrancar");
                break;}
            case 1:
                {System.out.println("Aranca, pero indica que la gasolina se esta agotando");
                break;}
            case 2:
                {System.out.println("Arranca sin problemas");
                break;}
        }
    }
}
