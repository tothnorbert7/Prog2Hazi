/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizenegyesFeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Egyetem {
    
    public static void legfiatalabbH(List<Hallgato> list) {
       if (list.size() >= 3)
       {
           Collections.sort(list);
           for (int i=0; i<3; i++)
           {
               System.out.println(list.get(i));
           }
       }
       else
       {
           Collections.sort(list);
           for (Szemely i:list)
           {
               System.out.println(i);
           }
       }
    }
    
    public static void nevHozzafuz(List<Oktato> list) {
        for (Oktato i:list)
        {
            if (!(i.isFerfi()))
            {
                if (i.getTanszek().equals("IT"))
                {
                   i.setNev(i.getNev()+"!");
                }
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        List<Szemely> sze = new ArrayList<>();
        sze.add(new Hallgato(4.1, "Elek", 20, true));
        sze.add(new Hallgato(4.5, "Akos", 23, true));
        sze.add(new Hallgato(3.1, "István", 21, true));
        sze.add(new Hallgato(5.0, "Petra", 22, false));
        sze.add(new Hallgato(2.3, "Gergo", 19, true));
        
        System.out.println();
        for (Szemely i:sze)
        {
            System.out.println(i.toString());
        }
        System.out.println();
        
        sze.remove(1);
        
        for (Szemely i:sze)
        {
            System.out.println(i.toString());
        }
        System.out.println();
        
       
        List<Hallgato> sze1 = new ArrayList<>();
        sze1.add(new Hallgato(4.1, "Elek", 20, true));
        sze1.add(new Hallgato(4.5, "Akos", 23, true));
        sze1.add(new Hallgato(3.1, "István", 21, true));
        sze1.add(new Hallgato(5.0, "Petra", 22, false));
        sze1.add(new Hallgato(2.3, "Gergo", 19, true));
        
        System.out.println();
        for (Szemely i:sze)
        {
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Legfiatalabb hallgatók: ");
        legfiatalabbH(sze1);
        System.out.println();
        
        
        List<Oktato> okt = new ArrayList<>();
        okt.add(new Oktato("Bela", 35, true, "Grafika"));
        okt.add(new Oktato("Rozi", 30, false, "Grafika"));
        okt.add(new Oktato("Joska", 28, true, "Grafika"));
        okt.add(new Oktato("Anna", 33, false, "IT"));
        okt.add(new Oktato("Katalin", 38, false, "IT"));
        
        nevHozzafuz(okt);
        
        for (Oktato i:okt)
        {
            System.out.println(i.toString());
        }
        
    }
 
}
