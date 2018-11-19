/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizenegyesFeladat;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Norbert
 */
public class main {
    
    public static double atlagJoKepessegu(Set<Szemely> hm) {
        
        int sum=0;
        int db=0;
        for (Szemely i:hm)
        {
            if (i instanceof Hallgato)
            {
                if (((Hallgato) i).JoKepessegu())
                {
                    sum=sum+((Hallgato) i).eletkor;
                    db=db+1;
                }
            }
        }
        return sum/db;
        
    }
    
    public static void main(String[] args) {
        Szemely sz1 = new Szemely("Mona Liza", 20, false);
        System.out.println(sz1.toString());
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        Szemely[] szemelyek = new Szemely[4];
        for (int i=0; i<2; i++)
        {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            szemelyek[i] = new Szemely(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]));
            
        }
        for (int i=2; i<4; i++)
            {
                String sor = sc.nextLine();
                String st[] = sor.split(" ");
                szemelyek[i] = new Oktato(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);  
            }
        
        System.out.println();
        for (Szemely i:szemelyek)
        {
            System.out.println(i.toString());
            
        }
        
        
        
    }
    
}
