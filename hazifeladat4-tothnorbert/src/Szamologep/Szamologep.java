/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szamologep;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Norbert
 */
public class Szamologep extends JFrame {
    private JButton bnum0;
    private JButton bnum1;
    private JButton bnum2;
    private JButton bnum3;
    private JButton bnum4;
    private JButton bnum5;
    private JButton bnum6;
    private JButton bnum7;
    private JButton bnum8;
    private JButton bnum9;
    private JButton b;
    private JButton bs;
    private JButton ce;
    private JButton c;
    private JButton mc;
    private JButton mr;
    private JButton ms;
    private JButton mplus;
    private JButton osztas;
    private JButton szorzas;
    private JButton osszeadas;
    private JButton kivonas;
    private JButton sqrt;
    private JButton szazalek;
    private JButton lg;
    private JButton egyenlo;
    private JButton pm;
    private JButton tizedesvesszo;
    
    //private JTextField tf1;
    private JTextArea tf1;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;

    public Szamologep() {
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tf1 = new JTextArea(1, 1);
        bnum0 = new JButton("  0  ");
        bnum1 = new JButton("  1  ");
        bnum2 = new JButton("  2  ");
        bnum3 = new JButton("  3  ");
        bnum4 = new JButton("  4  ");
        bnum5 = new JButton("  5  ");
        bnum6 = new JButton("  6  ");
        bnum7 = new JButton("  7  ");
        bnum8 = new JButton("  8  ");
        bnum9 = new JButton("  9  ");
        b = new JButton("");
        bs = new JButton("<html><body><font color=#FF0000>Backspace</font></body></html>");
        ce = new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        c = new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        mc = new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        mr = new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        ms = new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        mplus = new JButton("<html><body><font color=#FF0000>M+</font></body></html>");
        osztas = new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        szorzas = new JButton("<html><body><font color=#FF0000>*</font></body></html>");
        osszeadas = new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        kivonas = new JButton("<html><body><font color=#FF0000>-</font></body></html>");
        sqrt = new JButton("  sqrt  ");
        szazalek = new JButton("  %  ");
        lg = new JButton("  1/x  ");
        egyenlo = new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        pm = new JButton("  +/-  ");
        tizedesvesszo = new JButton("  ,  ");
        
        GridLayout gr = new GridLayout(6,1);
        setLayout(gr);
        
        p1 = new JPanel();
        GridLayout gr1 = new GridLayout(1,1);
        p1.setLayout(gr1);
        p1.add(tf1);
        
        p2 = new JPanel();
        GridLayout gr2 = new GridLayout(1,4);
        p2.setLayout(gr2);
        p2.add(b);
        p2.add(bs);
        p2.add(ce);
        p2.add(c);
        
        p3 = new JPanel();
        GridLayout gr3 = new GridLayout(1,6);
        p3.setLayout(gr3);
        p3.add(mc);
        p3.add(bnum7);
        p3.add(bnum8);
        p3.add(bnum9);
        p3.add(osztas);
        p3.add(sqrt);
        
        p4 = new JPanel();
        GridLayout gr4 = new GridLayout(1,6);
        p4.setLayout(gr4);
        p4.add(mr);
        p4.add(bnum4);
        p4.add(bnum5);
        p4.add(bnum6);
        p4.add(szorzas);
        p4.add(szazalek);
        
        p5 = new JPanel();
        GridLayout gr5 = new GridLayout(1,6);
        p5.setLayout(gr5);
        p5.add(ms);
        p5.add(bnum1);
        p5.add(bnum2);
        p5.add(bnum3);
        p5.add(kivonas);
        p5.add(lg);
        
        p6 = new JPanel();
        GridLayout gr6 = new GridLayout(1,6);
        p6.setLayout(gr6);
        p6.add(mplus);
        p6.add(bnum0);
        p6.add(pm);
        p6.add(tizedesvesszo);
        p6.add(osszeadas);
        p6.add(egyenlo);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        
        pack();
        
        bnum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("0".toString());
            }
        });
        
        bnum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("1".toString());
            }
        });
        
        bnum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("2".toString());
            }
        });
        
        bnum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("3".toString());
            }
        });
        
        bnum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("4".toString());
            }
        });
        
        bnum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("5".toString());
            }
        });
        
        bnum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("6".toString());
            }
        });
        
        bnum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("7".toString());
            }
        });
        
        bnum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("8".toString());
            }
        });
        
        bnum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("9".toString());
            }
        });
        
        osszeadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("+".toString());
            }
        });
        
        egyenlo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.append("=".toString());
            }
        });
    }
    
    public static void main(String[] args) {
        Szamologep sz = new Szamologep();
        
    }
    
}
