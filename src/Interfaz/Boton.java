/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
    
    public void CambiarNombre(int x, int y){
        setText((x+1)+""+(y+1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //
    }
    
   
    
}
