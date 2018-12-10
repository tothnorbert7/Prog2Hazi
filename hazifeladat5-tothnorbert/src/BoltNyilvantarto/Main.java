/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoltNyilvantarto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Termek> li = new ArrayList<>();
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            String sor;
            
            while ((sor=br.readLine())!= null)
            {
                String[] st = sor.split(";");
                Termek t = new Termek(st[st.length-4], st[st.length],Double.parseDouble(st[st.length-3]));
                li.add(t);
            }
            
            br.close();
            
            
        } catch(IOException e)
        {
            System.out.println("Fájl hiba");
        }
        
        
        for (Termek i:li)
        {
            System.out.println(li.toString());
        }
       
       
        
    }
    
}
