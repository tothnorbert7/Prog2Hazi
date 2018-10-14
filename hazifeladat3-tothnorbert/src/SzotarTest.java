
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
public class SzotarTest {
    
    public static Szotar[] szt;
    
    public static void kiiratas(Szotar[] sz)
    {
        for (int i=0; i<sz.length; i++)
        {
            System.out.println(sz[i].toString());
        }
        
    }
     
       
    public static void rendezes(Szotar[] sz) {
        for (int i=0; i<sz.length-1; i++)
        {
            for (int j=i+1; j<sz.length; j++)
            {
                if (sz[i].getAngolszo().equals(sz[j].getAngolszo()))
                {
                    if (sz[i].getMagyarszo().compareTo(sz[j].getMagyarszo()) > 0)
                    {
                        Szotar tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
                }
                else
                {
                    if (sz[i].getAngolszo().compareTo(sz[j].getAngolszo()) > 0)
                     {
                        Szotar tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;   
                    }
                    
                }
                
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        szt = new Szotar[n];
        
        for (int i=0; i<n; i++)
        {
            String sor = sc.nextLine();
            String st[] =sor.split(":");
            szt[i]=new Szotar(st[0], st[1]);
        }
        System.out.println();
        
        rendezes(szt);
        kiiratas(szt);
        
        
    }
    
}
