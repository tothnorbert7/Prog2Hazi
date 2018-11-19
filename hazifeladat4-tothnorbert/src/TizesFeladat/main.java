/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizesFeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */

    

public class main {
   public static List<Teherauto> TeherBirasMetodus(Teherauto[] th) {
       
       List<Teherauto> teherautok = new ArrayList<>();
       for (int i=0; i<th.length; i++)
       {
           if (th[i].getTeherbiras() > 20000)
           {
               teherautok.add(new Teherauto(th[i].getRendszam(), th[i].getTeljesitmeny(), th[i].isAutomata(), th[i].getTeherbiras()));
           }
       }
       return teherautok;
   }
   
   public static void maxTeljesitmenyAuto(List<Auto> a) {
       if (a.size() >= 3)
       {
           Collections.sort(a);
           for (int i=0; i<3; i++)
           {
               System.out.println(a.get(i));
           }
           
       }
       else
       {
           Collections.sort(a);
           for (Auto i:a)
           {
               System.out.println(i);
           }
       }
       
   }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rendszam = sc.nextLine();
        Auto a1 = new Auto(rendszam, 100, true);
        System.out.println(a1.toString());
        
        Auto[] autok = new Auto[2];
        Teherauto[] teherautok = new Teherauto[3];
        for (int i=0; i<2; i++)
        {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            autok[i] = new Auto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]));
        }
        for (int i=0; i<3; i++)
        {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            teherautok[i] = new Teherauto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Integer.parseInt(st[3]));
        }
        
        System.out.println();
        
        for (Auto i:autok)
        {
            System.out.println(i.toString());
        }
        for (Teherauto i:teherautok)
        {
            System.out.println(i.toString());
        }
        
        System.out.println();
        System.out.println("Teherautók, amelyeknek a teherbírása meghaladja a 20 tonnát:");
        System.out.println();
        System.out.println(TeherBirasMetodus(teherautok));
        
        List<Auto> a = new ArrayList<>();
        a.add(new Auto("ASD123", 60, true));
        a.add(new Auto("ASD124", 100, true));
        a.add(new Auto("ASD125", 45, true));
        a.add(new Auto("ASD126", 75, true));
        a.add(new Auto("ASD127", 80, true));
        System.out.println();
        System.out.println("Legnagyobb teljesítményű autók:");
        maxTeljesitmenyAuto(a);
        

        
        
        
        
    }
    
    
}
