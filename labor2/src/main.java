/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class main {
    
    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(2, 3.5);
//        double r3 = 4;
//        System.out.println(r3);
//        
//        System.out.println(r1);
//        
//        System.out.println("A téglalap területe = "+r2.getArea());
//        System.out.println("A téglalap kerülete = "+r2.getPerimeter());
//        System.out.println(r2.getHeight());
//        r2.setHeight(12);
//        System.out.println(r2.getHeight());
        
        QEquation e1 = new QEquation(1, 2, 3);
        QEquation e2 = new QEquation(2, 4, 1);
        System.out.println("x1= "+e1.getRoot1()+" " + "x2= "+e1.getRoot2());
        System.out.println("x1= "+e2.getRoot1()+" " + "x2= "+e2.getRoot2());
        
        
        Account ac;
        System.out.println(Account.Rate);
        
        
        
    }
    
}
