/**
 * 
 * Interfaz para calcular el factorial de un numero y serie fibonacci
 * 
 * @author: Diaz García Zyanya Paola
 * @author: Rodriguez de la Mora Elizabeth Dayanne
 * @version:  1.0
 */
package factorial.en.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class fact extends JFrame implements ActionListener,KeyListener {

    JButton Fibo, Fact;
    JLabel numo, rs, rs2;
    JTextField Numero;
    Font font = new Font("Century Gothic", Font.LAYOUT_RIGHT_TO_LEFT, 16);

    //Constructor
    public fact() {
        setLayout(null);
        
        Fibo = new JButton("Fibonacci");
        Fibo.setBounds(100, 190, 200, 30);
        Fibo.setFont(font);
        Fibo.setBackground(Color.PINK);
        Fibo.addActionListener(this);
        add(Fibo);

        Fact = new JButton("Factorial");
        Fact.setBounds(100, 140, 200, 30);
        Fact.setFont(font);
        Fact.setBackground(Color.cyan);
        Fact.addActionListener(this);
        add(Fact);

        Numero = new JTextField();
        Numero.setBounds(100, 100, 100, 30);
        Numero.addKeyListener(this);
        add(Numero);

        numo = new JLabel("Numero");
        numo.setBounds(20, 100, 100, 30);
        add(numo);
 
        rs2 = new JLabel("(En caso de pulsar fibonacci, el numero debe ser mayor o igual a 1)");
        rs2.setBounds(0, 400, 100, 30);
        add(rs2);
     

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 500, 500);
        setVisible(true);

    }
    
   
    //Detecta que boton se pulsa para ejecutar el metodo correspondiente
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Factorial")) {

            Operacion datos = new Operacion();
            datos.setNum1(Integer.parseInt(Numero.getText()));
            double resulta = datos.facto();
            JOptionPane.showMessageDialog(null, "El factorial de este numero es " + resulta);
        }
        
        //El numero escrito debe ser mayor a uno
        if (e.getActionCommand().equals("Fibonacci")) {

            Operacion datos = new Operacion();
            datos.setNum1(Integer.parseInt(Numero.getText()));
            String resulta = datos.Fibo();
            JOptionPane.showMessageDialog(null, "La serie Fibonacci es: 0 1 " + resulta);
        }
        Numero.setText("");
    }
    
    //Metodo que valida que no se puedan escribir letras
     @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        if(Numero == e.getSource()){
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
