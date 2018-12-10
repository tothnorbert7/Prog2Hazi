/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merlegeles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Teszt {
    public static List<Ceg> lista = new ArrayList<>();
    
    public static void osszeadPontok(List<Ceg> z) {
        Collections.sort(lista);
        
        for (int i=0; i<z.size()-1; i++)
        {
            for (int j=i+1; j<z.size(); j++)
            {
                if (z.get(i).getCegnev().equals(z.get(j).getCegnev()))
                {
                    z.get(i).setArbevetel(z.get(i).getArbevetel()+z.get(j).getArbevetel());
                    z.remove(j);
                    
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        List<Ceg> l = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);

            String sor;
            while ((sor = br.readLine()) != null) {
                String [] st=sor.split(":");
                Ceg c=new Ceg(st[0], st[1], Integer.parseInt(st[2]), Integer.parseInt(st[3]));
                
                l.add(c);
            }
            
            br.close();

            
        } catch (IOException e) {
            System.out.println("Fájl hiba.");

        }
        
        for (Ceg i:l)
        {
            System.out.println(i.toString());
        }
        
        System.out.println();
        osszeadPontok(lista);
        
        for (Ceg i:lista)
        {
            System.out.println(i.toString());
        }
        
    }
    
}
