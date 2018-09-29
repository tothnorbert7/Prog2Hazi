/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class main {
    public static void main(String[] args) {
    
    // 1. feladat:    
        Pont p1 = new Pont(2, 5);
        Pont p2 = new Pont(4, 3);
        Pont p3 = new Pont(5, 6);
        Pont p4 = new Pont(8, 2);
        
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        
        System.out.println("x= "+p1.getX()+" y= "+p1.getY());
        System.out.println("x= "+p2.getX()+" y= "+p2.getY());
        System.out.println("x= "+p3.getX()+" y= "+p3.getY());
        System.out.println("x= "+p4.getX()+" y= "+p4.getY());
        
    //2. feladat:
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println(rp1);
        System.out.println("Kerülete: "+rp1.getPerimeter()+" Területe: "+rp1.getArea());
        System.out.println("\n");
        
        System.out.println(rp2);
        System.out.println("Kerülete: "+rp2.getPerimeter()+" Területe: "+rp2.getArea());
        System.out.println("\n");
        
        System.out.println(rp3);
        System.out.println("Kerülete: "+rp3.getPerimeter()+" Területe: "+rp3.getArea());
        System.out.println("\n");
    
    //3. feladat:
        Rectangle rc1 = new Rectangle(4, 40);
        Rectangle rc2 = new Rectangle(3.5, 35.9);
        
        System.out.println(rc1);
        System.out.println("Területe: "+rc1.getArea()+"  Kerülete: "+rc1.getPerimeter());
        
        System.out.println(rc2);
        System.out.println("Területe: "+rc2.getArea()+"  Kerülete: "+rc2.getPerimeter());
        
    //5. feladat:
       QuadraticEquation q1 = new QuadraticEquation(3, 5, 1);
        System.out.println(q1);
       QuadraticEquation q2 = new QuadraticEquation(4, 1, 2);
        System.out.println(q2);
       QuadraticEquation q3 = new QuadraticEquation(2, 4, 1);
        System.out.println(q3);
        
    //6. feladat:
        LinearEquation le1 = new LinearEquation(2, 3, 5, 4, 7, 3);
        System.out.println(le1);
        System.out.println("X= "+le1.getX());
        System.out.println("Y= "+le1.getY()+"\n");
        
        LinearEquation le2 = new LinearEquation(2, 1, 0, 4, 5, 8);
        System.out.println(le2);
        System.out.println("X= "+le2.getX());
        System.out.println("Y= "+le2.getY()+"\n");
        
        LinearEquation le3 = new LinearEquation(1, 5, 3, 6, 7, 2);
        System.out.println(le3);
        System.out.println("X= "+le3.getX());
        System.out.println("Y= "+le3.getY()+"\n");
        
    }
}
