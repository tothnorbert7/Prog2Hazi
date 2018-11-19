/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AltalanosIskola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class main {
    
    public static List<Osztalypenz> lista = new ArrayList<>();
    
    public static void OsszeadPenz(List<Osztalypenz> li) {
        Collections.sort(lista);
        
        for (int i=0; i<li.size()-1; i++)
        {
            for (int j=i+1; j<li.size(); j++)
            {
                if (li.get(i).getNev().equals(li.get(j).getNev()))
                {
                    li.get(i).setPenz(li.get(i).getPenz()+li.get(j).getPenz());
                    li.remove(j);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        while(sor.length()>0) {
            String[] s = sor.split(";");
            lista.add(new Osztalypenz(s[0], Integer.parseInt(s[1])));
        sor = sc.nextLine();
        } 
       
        
        System.out.println();
        OsszeadPenz(lista);
        
        for (Osztalypenz i:lista)
        {
            System.out.println(i.toString());
        }
        
        
    }
    
}
