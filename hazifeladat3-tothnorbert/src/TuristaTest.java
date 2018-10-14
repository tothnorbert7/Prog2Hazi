
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class TuristaTest {
    
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Turista[] t = new Turista[n];
    
    for (int i=0; i<n; i++)
    {
        {
            String sor=sc.nextLine();
            String st[]=sor.split(";");
            t[i]=new Turista(st[0], st[1]);
            
            int orszagos=0;
            int helyi=0;
            
            String szo = t[i].getUtvonal();
            
            for (int j=0; j<szo.length()-1; j++)
            {
                if (st[1].charAt(j)=='K')
                {
                    orszagos=orszagos+1;
                    
                
                }
                
                
                if (st[1].charAt(j)=='P' || st[1].charAt(j)=='S' || st[1].charAt(j)=='Z')
                {
                    helyi=helyi+1;
                    
                }
                
                
                
            }
            
        }
     
    }
    
    
    
    System.out.println();
    for (int i=0; i<n; i++)
    {
            System.out.println(t[i].toString());
    }
      
    }
}

