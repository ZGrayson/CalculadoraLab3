/**
 * Ejercicio: Calculadora de TCP para numeros
 * 
 * @author: Diaz García Zyanya Paola
 * @author: Rodriguez de la Mora Elizabeth Dayanne 
 * @version:  1.0 
 */
package Trinomio;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Grafico extends JFrame implements ActionListener,KeyListener {
/* CONSTRUCTOR GRAFICO DEL PROGRAMA*/
    JButton Convertir, con;
    JTextField Uno, Dos;
    JLabel Termino1, suma, exponente, c1, c2;
    Font font = new Font("Century Gothic", Font.LAYOUT_RIGHT_TO_LEFT, 16);

    public Grafico() {
        setLayout(null);
        this.getContentPane().setBackground(Color.white);

        Termino1 = new JLabel("Terminos a convertir");
        Termino1.setFont(font);
        Termino1.setBounds(20, 70, 300, 30);
        add(Termino1);

        c1 = new JLabel("(");
        c1.setFont(font);
        c1.setBounds(140, 120, 300, 30);
        add(c1);

        Uno = new JTextField("");
        Uno.setBounds(150, 120, 100, 30);
        Uno.addKeyListener(this);
        add(Uno);

        suma = new JLabel("±");
        suma.setFont(font);
        suma.setBounds(260, 120, 300, 30);
        add(suma);

        Dos = new JTextField("");
        Dos.setBounds(280, 120, 100, 30);
        Dos.addKeyListener(this);
        add(Dos);

        c2 = new JLabel(")");
        c2.setFont(font);
        c2.setBounds(390, 120, 300, 30);
        add(c2);

        Convertir = new JButton("Convertir con signo '+'");
        Convertir.setBounds(100, 200, 300, 30);
        Convertir.setFont(font);
        Convertir.setBackground(Color.orange);
        Convertir.addActionListener(this);
        add(Convertir);

        con = new JButton("Convertir con signo '-'");
        con.setBounds(100, 250, 300, 30);
        con.setFont(font);
        con.setBackground(Color.orange);
        con.addActionListener(this);
        add(con);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 500, 400);
        setVisible(true);
    }

    /*Recibe los datos y los envia "Opercion"*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Convertir con signo '+'")) {

            Operacion datos = new Operacion();
             datos.setTerA((Integer.parseInt(Uno.getText())));
            datos.setTeraB(Integer.parseInt(Dos.getText()));
            String Equis = datos.Binomio();
            double algo=datos.Opera();
            /*Despliega el desarrollo y resultado de TCP*/
            JOptionPane.showMessageDialog(null, "El binomio desarrollado es " + Equis+" = "+algo);
           
        }
        
        if (e.getActionCommand().equals("Convertir con signo '-'")) {

            Operacion datos = new Operacion();
             datos.setTerA((Integer.parseInt(Uno.getText())));
            datos.setTeraB(Integer.parseInt(Dos.getText()));
            String Equis = datos.Binomio();
            double algo=datos.Opera2();
            /*Despliega el desarrollo y resultado de TCP*/
            JOptionPane.showMessageDialog(null, "El binomio desarrollado es " + Equis+" = "+algo);
           
        }

    }
    
    //Metodo que valida que no se puedan escribir letras
     @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        if(Uno == e.getSource()){
            if(((((letra >= 'a') && (letra <= 'z')))) && (letra != ' ') && (!((letra >= 'A') && (letra <= 'Z'))) && (letra != 'ñ')){
                e.consume();
            }
        } 
         if(Dos == e.getSource()){
            if(((((letra >= 'a') && (letra <= 'z')))) && (letra != ' ') && (!((letra >= 'A') && (letra <= 'Z'))) && (letra != 'ñ')){
                e.consume();
            }
        } 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
