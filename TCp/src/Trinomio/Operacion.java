package Trinomio;
/**
 * Ejercicio: Calculadora de TCP para numeros
 * 
 * @author: Diaz García Zyanya Paola
 * @author: Rodriguez de la Mora Elizabeth Dayanne 
 * @version:  1.0 
 */
public class Operacion {
    /*Recibe y asigna el valor de los terminos*/
    private int terA;
    private int TeraB;
    private String Resultado;
     private double Resulta;

    public int getTerA() {
        return terA;
    }

    public void setTerA(int terA) {
        this.terA = terA;
    }

    public int getTeraB() {
        return TeraB;
    }

    public void setTeraB(int TeraB) {
        this.TeraB = TeraB;
    }
    
    public String Binomio(){
    /*Realiza el desarrollo del TCP*/
        String TerA2 =(terA+"²"+"±");
        String segundo = ("2"+"("+terA+")"+"("+TeraB+")"+"+");
        String TerB2 = (TeraB+"²");
        String rest;
        rest = TerA2 + segundo;
        Resultado = rest + TerB2;
        return Resultado;
    }
    
    public double Opera(){
    /*Realiza la operación para el resultado del TCP*/
        int TerA2 = (int) Math.pow(terA,2);
        int segund = terA * 2 * TeraB;
        int TerB2 = (int) Math.pow(TeraB, 2);
        int rest;
        rest = TerA2 + segund;
        Resulta = rest + TerB2;
        return Resulta;
    
}
    
     public double Opera2(){
    /*Realiza la operación para el resultado del TCP*/
        int TerA2 = (int) Math.pow(terA,2);
        int segund = terA * 2 * TeraB;
        int TerB2 = (int) Math.pow(TeraB, 2);
        int rest;
        rest = TerA2 - segund;
        Resulta = rest + TerB2;
        return Resulta;
    
}
    
    
}
