/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karacsony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class main {
    private static List<KaracsonyiHozzavalok> lista = new ArrayList<>();
    
    public static void osszeadHozzavalok(List<KaracsonyiHozzavalok> k) {
        Collections.sort(lista);
        for (int i=0; i<k.size()-1; i++)
        {
            for (int j=i+1; j<k.size(); j++)
            {
                if (k.get(i).getHozzavalo().equals(k.get(j).getHozzavalo()))
                {
                    k.get(i).setMennyiseg(k.get(i).getMennyiseg()+k.get(j).getMennyiseg());
                    k.remove(j);
                }
            }
        }
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        while(sor.length()>0) {
            String[] s = sor.split(";");
            lista.add(new KaracsonyiHozzavalok(s[0], Integer.parseInt(s[1])));
        sor = sc.nextLine();
        } 
       
        
        System.out.println();
        osszeadHozzavalok(lista);
        
        for (KaracsonyiHozzavalok i:lista)
        {
            System.out.println(i.toString());
        }
        
        
    }
    
}
