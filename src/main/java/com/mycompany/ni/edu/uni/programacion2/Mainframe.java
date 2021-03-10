/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ni.edu.uni.programacion2;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingUtilities;

/**
 *
 * @author Sistemas-12
 */
public class Mainframe extends JFrame {
    
    private JLabel titlelabel;

    public Mainframe() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setTitle("My first frame");
        setVisible(true);
        
        titlelabel = new JLabel("HOLA  MUNDO");
        
        getContentPane().add(titlelabel);
        setVisible(true);

    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(()-> new Mainframe());
    }
    
    
}
