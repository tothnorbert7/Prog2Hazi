/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZHEredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class main {
    public static List<ZarthelyiE> lista = new ArrayList<>();
    
    public static void osszeadPontok(List<ZarthelyiE> z) {
        Collections.sort(lista);
        
        for (int i=0; i<z.size()-1; i++)
        {
            for (int j=i+1; j<z.size(); j++)
            {
                if (z.get(i).getNev().equals(z.get(j).getNev()))
                {
                    z.get(i).setPont(z.get(i).getPont()+z.get(j).getPont());
                    z.remove(j);
                    
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        while(sor.length()>0) {
            String[] s = sor.split(";");
            lista.add(new ZarthelyiE(s[0], Integer.parseInt(s[1])));
        sor = sc.nextLine();
        } 
       
        
        System.out.println();
        osszeadPontok(lista);
        
        for (ZarthelyiE i:lista)
        {
            System.out.println(i.toString());
        }
        
        
    }
    
}
