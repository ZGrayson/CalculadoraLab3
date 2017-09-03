/**
 * Ejercio: Ejercio de constructores (Mi ejemplo)
 * @author: Díaz García Zyanya Paola
 * @version:1.0
 * Fecha: 03/09/2017
 */
package coches;

public class Mi_Ejemplo 
{
    //Se inicializa una variable privada sin valor asignado
    private int dinero=0;
    
    //Constructor que necesita recibir un parametro
    Mi_Ejemplo(int dinero)
    {
        this.dinero=dinero;
    }
    
    //Constructor vacio que no necesita recibir un parametro
    Mi_Ejemplo()
    {
        
    }   
    
    //Método que verifica si que puedo comprar con el dinero que se me dio
    public void compra()
    {
        switch(dinero)
        {
            case 0:
                {System.out.println("No puedo comprar ni pagar nada");
                break;}
            case 200:
                {System.out.println("Puedo pagar mi transporte y la comida de algunos dias");
                break;}
            case 350:
                {System.out.println("Puedo pagar el transporte y comprar diario mi comida");
                break;}
            case 500:
                {System.out.println("Puedo pagar mi transporte,comprar mi comida y comprar un libro");
                break;}   
        }
    }
}
