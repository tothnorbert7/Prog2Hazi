/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HetesFeladatLakoHaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Test {
    public static List<Lakohaz> tagasLakohazak(List<Lakohaz> lh, double terfogat) {
        List<Lakohaz> l2 = new ArrayList<>();
        for(Lakohaz i:lh) 
            if(i.legkobmeter()> terfogat)
            {    
                l2.add(i);
            } 
            return l2;
    }
    
    public static void main(String[] args) {
        List<Lakohaz> lh = new ArrayList<>(); //az arraylist osztály konstruktora hívódik meg
        lh.add(new Lakohaz("Cim 1", 10, 20.4));
        lh.add(new Lakohaz("Cim haz 2", 12, 15.5));
        lh.add(new Lakohaz("Cim 3", 7, 24.7));
        lh.add(new Lakohaz("Cim lakas 4", 4, 7.5));
        lh.add(new Lakohaz("Cim haz 5", 9, 11.2));
       
        
        System.out.println("Lakóházak: ");
        System.out.println();
        
//        for (Lakohaz i:lh)
//        {
//            System.out.println(i);
//        }
        
        
        
        for(int i=0; i<lh.size(); i++){
            System.out.println(lh.get(i));
        }
        
       

//        lh.set(0, new Lakohaz("Egy 222", 2, 4)); //alapterülethez hozzá kell adni egy settert!!!!!!! (hogy ez működjön)
//    
//        System.out.println(lh.get(0));
//    
//        System.out.println(lh.contains(new Lakohaz("Egy 222", 2, 4)));
//    
//    
//        System.out.println(lh.lastIndexOf(new Lakohaz("Egy 222", 2, 4)));
        
        
        
        System.out.println();
        System.out.println("Metódus tesztelése:");
        System.out.println();
        
        List<Lakohaz> l3 = tagasLakohazak(lh, 75);
        Collections.sort(l3);
        for(Lakohaz i:l3)
        {
            System.out.println(i);
        }       
        
    }
}
