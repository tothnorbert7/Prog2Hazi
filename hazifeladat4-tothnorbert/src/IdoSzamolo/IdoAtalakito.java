/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdoSzamolo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Norbert
 */
public class IdoAtalakito extends JFrame implements ActionListener{
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    private JButton b1;
    
    private JLabel l1;
    private JLabel l11;
    private JLabel l111;
    private JLabel l2;
    private JLabel l22;
    private JLabel l222;
    private JLabel l3;
    private JLabel l33;
    private JLabel l333;
    private JLabel l4;
    private JLabel l44;
    private JLabel l444;
    
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    
    

    public IdoAtalakito() {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1 = new JButton("Számol");
        
        l1 = new JLabel("nap");
        l11 = new JLabel("nap");
        l111 = new JLabel("nap");
        l2 = new JLabel("óra");
        l22 = new JLabel("óra");
        l222 = new JLabel("óra");
        l3 = new JLabel("perc");
        l33 = new JLabel("perc");
        l333 = new JLabel("perc");
        l4 = new JLabel("másodperc");
        l44 = new JLabel("másodperc");
        l444 = new JLabel("másodperc");
        
        tf1 = new JTextField(4);
        tf2 = new JTextField(4);
        tf3 = new JTextField(4);
        tf4 = new JTextField(4);
        tf5 = new JTextField(4);
        tf6 = new JTextField(4);
        tf7 = new JTextField(4);
        tf8 = new JTextField(4);
        tf9 = new JTextField(4);
        tf10 = new JTextField(4);
        tf11 = new JTextField(4);
        tf12 = new JTextField(4);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        
        GridLayout gr1 = new GridLayout(1, 1);
        p3.setLayout(gr1);
        
        
        p1.add(tf1);
        p1.add(l1);
        p1.add(tf2);
        p1.add(l2);
        p1.add(tf3);
        p1.add(l3);
        p1.add(tf4);
        p1.add(l4);
        
        p2.add(tf5);
        p2.add(l11);
        p2.add(tf6);
        p2.add(l22);
        p2.add(tf7);
        p2.add(l33);
        p2.add(tf8);
        p2.add(l44);
        
        p3.add(b1);
        
        p4.add(tf9);
        p4.add(l111);
        p4.add(tf10);
        p4.add(l222);
        p4.add(tf11);
        p4.add(l333);
        p4.add(tf12);
        p4.add(l444);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        pack();
    }
    
    public static void main(String[] args) {
        
        IdoAtalakito ia = new IdoAtalakito();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
        {
            
        }
        
        
    }
    
    
    
    
}

       
