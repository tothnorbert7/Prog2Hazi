
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
public class HullmTest {
    
    public static Hullamvasutak[] hm;
    
    private static void rendezes(Hullamvasutak[] hm)
    {
        for (int i=0; i<hm.length-1; i++)
        {
            for (int j=i+1; j<hm.length; j++)
            {
                if (hm[i].getVarakozas() > hm[j].getVarakozas())
                {
                    Hullamvasutak tmp = hm[i];
                    hm[i]=hm[j];
                    hm[j]=tmp;
                }
                else if (hm[i].getVarakozas() == hm[j].getVarakozas())
                {
                    if (hm[i].getMinmagassag() < hm[j].getMinmagassag())
                    {
                        Hullamvasutak tmp=hm[i];
                        hm[i]=hm[j];
                        hm[j]=tmp;
                    }
                    else if (hm[i].getNev().compareTo(hm[j].getNev()) > 0)
                    {
                        Hullamvasutak tmp=hm[i];
                        hm[i]=hm[j];
                        hm[j]=tmp;
                        
                    }
                 }
             }       
        }
    }    
    
    private static void kiiratas(Hullamvasutak[] hm)
        {
            for (int i=0; i<hm.length; i++)
            {
                System.out.println(hm[i]);
            }
        }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        hm = new Hullamvasutak[n];
        for (int i=0; i<n; i++)
        {
            String sor=sc.nextLine();
            String st[]=sor.split(";");
            hm[i]=new Hullamvasutak(st[0], st[1], Integer.parseInt(st[2]), Integer.parseInt(st[3]));
        }
        
        
        System.out.println();
        rendezes(hm);
        kiiratas(hm);
        
    }
    
    
}
