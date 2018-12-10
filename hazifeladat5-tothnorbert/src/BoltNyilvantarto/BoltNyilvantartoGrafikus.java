/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoltNyilvantarto;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Norbert
 */
public class BoltNyilvantartoGrafikus extends JFrame{
    
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    
    private JButton b1;
    private JButton b2;
    
    public BoltNyilvantartoGrafikus() {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Termékek beszerzése");
        l2 = new JLabel("Termékek eladása");
        l3 = new JLabel("Név:");
        l4 = new JLabel("Mennyiség:");
        l5 = new JLabel("Egységár:");
        l6 = new JLabel("Név:");
        l7 = new JLabel("Mennyiség:");
        
        p1 = new JPanel();
        p2 = new JPanel();
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        
        b1 = new JButton("Hozzáadás");
        b2 = new JButton("Eladás");     
        
        
        
        GridLayout gr = new GridLayout(2, 1);
        setLayout(gr);
        
        
        
        GridLayout gr1 = new GridLayout(1, 1);
        p1.setLayout(gr1);
        //p1.add(l1);
        
        GridLayout gr2 = new GridLayout(1, 1);
        p2.setLayout(gr2);
        p2.add(b1);
        
        GridLayout gr3 = new GridLayout(3, 2);
        p1.setLayout(gr3);
        p1.add(l3);
        p1.add(tf1);
        p1.add(l4);
        p1.add(tf2);
        p1.add(l5);
        p1.add(tf3);
        
        
        
        this.add(p1);
        this.add(p2);
        
        
       
        pack();
    }
    
    
    public static void main(String[] args) {
        
        BoltNyilvantartoGrafikus b = new BoltNyilvantartoGrafikus();
        
    }
    
    
    
    
    
}
