/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

import java.util.Scanner;


/**
 *
 * @author Norbert
 */
public class main {
    
    private static void kiirOra(Ora[] o)
        {
            for (int i=0; i<o.length; i++)
            {
                System.out.println(o[i]);
            }
        }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy napot: ");
        String nap = sc.nextLine();
        Orarend orar = new Orarend(nap);
        
       
        System.out.println();
        System.out.println("Hány órát akar hozzáadni?");
        int orasz = sc.nextInt();
        Ora[] o1 = new Ora[orasz];
        
        
        for (int i=0; i<orasz; i++)
        {
            String sor = sc.nextLine();
//            String st[]=sor.split(",");
//            
//            o1[i]=new Ora(Integer.parseInt(st[0]), st[1], Integer.parseInt(st[2]));
        }
        
        kiirOra(o1);
        
        
    }
    
    
    
}
