/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KilencesFeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Test {
    
    public static void kiirMarkaSzerint(List<Hatizsak> ls) {
        Collections.sort(ls);
        for (Hatizsak i:ls)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        List<Hatizsak> h2 = new ArrayList<>();
        h2.add(new Hatizsak("Adidas", 5, 3, true));
        h2.add(new Hatizsak("Puma", 7, 4, true));
        h2.add(new Hatizsak("Fila", 4, 2, true));
        h2.add(new Hatizsak("Adidas", 10, 4, true));
        h2.add(new Hatizsak("Nike", 7, 2, true));
        h2.add(new Hatizsak("Adidas", 4, 6, true));
        
        System.out.println("Hátizsákok:");
        System.out.println();
        
        for (Hatizsak i:h2)
        {
            System.out.println(i.toString());
        }
        
        
        System.out.println();
        System.out.println("Rendezve:");
        kiirMarkaSzerint(h2);
        
        
        
        
    }
    
}
