
package examen1_app_apm_diazgarciazyanya_5im6;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.border.EmptyBorder;

public class GraficoC extends JFrame
{
	JTextField cifra;
	double resultado;
        String accion;
	JPanel teclado, acciones;
	boolean conversor = true;

	public GraficoC() 
        {
                super();
		setSize(500, 600);
		setTitle("Convertidor");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
                
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());

		cifra = new JTextField("0",35);
		cifra.setBorder(new EmptyBorder(4, 4, 4, 4));
		cifra.setFont(new Font("Rockwell", Font.BOLD,40));
		cifra.setHorizontalAlignment(JTextField.RIGHT);
		cifra.setEditable(false);
		cifra.setBackground(Color.WHITE);
		panel.add("North", cifra);

		teclado = new JPanel();
		teclado.setLayout(new GridLayout(4, 3));
		teclado.setBorder(new EmptyBorder(4, 4, 4, 4));

		for (int n = 9; n >= 0; n--) 
                {
                   nBoton("" + n);
		}

		nBoton(".");

		panel.add("Center", teclado);

		acciones = new JPanel();
		acciones.setLayout(new GridLayout(2, 1));
		acciones.setBorder(new EmptyBorder(4, 4, 4, 4));

		nBotonA("Convertir");
		nBotonA("CE");

		panel.add("East", acciones);

		validate();
	}

	private void nBoton(String num) 
        {
		JButton boton = new JButton();
		boton.setText(num);
                boton.setFont(new Font("Rockwell", Font.BOLD,40));
                boton.setBackground(Color.cyan);
		boton.addMouseListener(new MouseAdapter() 
                {
                    @Override
                    public void mouseReleased(MouseEvent evt) 
                    {
			JButton boton = (JButton) evt.getSource();
			eleccion(boton.getText());
                    }
		});

		teclado.add(boton);
	}

	private void nBotonA(String accion) 
        {
            JButton boton = new JButton(accion);
            boton.setForeground(Color.WHITE);
            boton.setFont(new Font("Rockwell", Font.BOLD,30));
            boton.setBackground(Color.PINK);
            boton.addMouseListener(new MouseAdapter() 
            {
                @Override
                public void mouseReleased(MouseEvent evt) 
                {
                    JButton boton = (JButton) evt.getSource();
                    botonOprimido(boton.getText());
                }
            });

            acciones.add(boton);
	}
        
	private void eleccion(String num) 
        {
		if (cifra.getText().equals("0") || conversor) 
                {
                    cifra.setText(num);
		} 
                else 
                {
                    cifra.setText(cifra.getText() + num);
		}
		conversor = false;
	}

	private void botonOprimido(String tecla) 
        {
            if (tecla.equals("Convertir")) 
            {
		resultado = new Double(cifra.getText());
                ConvertirD();
            }
            if (tecla.equals("CE")) 
            {
                resultado = 0;
                cifra.setText("");
                conversor = true;
            } 
            

            conversor = true;
	}

	private void ConvertirD() 
        {
            resultado=(resultado/19);
            cifra.setText("" + resultado);
            accion = "";
	}
}