package factorial.en.swing;

import static java.lang.System.out;

//Recibe y guarda el numero tecleado
public class Operacion {

    private int Num1;
    private int resultado = 1;
    private String cadena = "";

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    //Metodo factorial
    public double facto() {
        while (Num1 > 0) {
            resultado = resultado * Num1;
            Num1--;
        }
        return resultado;
    }
    
    //Metodo Fibonacci
    public String Fibo(){
    int i,  fibo1 = 1, fibo2 = 1;
    
    for(i=2;i<=Num1;i++){
             cadena = cadena+fibo2 + " ";
             
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
    return cadena;
    
    }
}
