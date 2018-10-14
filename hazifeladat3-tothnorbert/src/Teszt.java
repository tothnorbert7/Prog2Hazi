/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Teszt {
    
    public static Katona megkuzd(Katona k1, Katona k2) {
        System.out.println("Első katona: "+k1);
        System.out.println("Második katona: "+k2);
        System.out.println();
        
        if (k1.equals(k2))
        {
            return k1;
        }
        else
        {
            if (k1.getTamadoero() > k2.getVedoero())
            {
                return k1;
            }
            else
            { 
                return k2;
            }
        }
    }
    
    public static void main(String[] args) {
        Nyilas ny1 = new Nyilas(4, 7, 10);
        Nyilas ny2 = new Nyilas(3, 10, 9);
        Landzsas l1 = new Landzsas(11, 10);
        
        
        System.out.println();
        System.out.println(megkuzd(megkuzd(ny1, ny2),l1));
        
    }
    
}
