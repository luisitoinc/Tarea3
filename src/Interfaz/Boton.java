/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Boton extends JButton implements ActionListener{
    
    public Boton(int posx, int posy, int ancho, int alto){
    super.setBounds(posx, posy, ancho, alto); 
    addActionListener(this);
    setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/signo.png"))); 
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        //
    }
    
    
     
    }
    
    
   
   
    
