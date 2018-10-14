
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class BudapKupaTest {
    
    private static BudapestKupa bpk[];
    
    private static void kiiratasMaximum(BudapestKupa[] b)
        {
            int max=0;
            for (int i=1; i<b.length; i++)
            {
                if (b[i].getResztav() >= b[max].getResztav())
                {
                    max=i;
                }
                System.out.println(b[max].toString());
            }
            
        }
    
    public static void kiir(BudapestKupa[] b)
    {
        for (int i=0; i<b.length; i++)
            {
                System.out.println(b[i]);
            }

    }
    
    private static void rendezes(BudapestKupa[] b)
    {
        //RENDEZES:
            
        for (int i=0; i<b.length-1; i++)
        {
            for (int j=i+1; j<b.length; j++)
            {
                if (b[i].getDatum().compareTo(b[j].getDatum()) > 0)
                {
                    BudapestKupa tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }
                else if (b[i].getDatum().compareTo(b[j].getDatum()) == 0)
                {
                    if (b[i].getTuraneve().compareTo(b[j].getTuraneve()) > 0)
                    {
                        BudapestKupa tmp=b[i];
                        b[i]=b[j];
                        b[j]=tmp;
                        
                    }
                }
                
            }
        }
        for (int i=1; i<b.length; i++)
            {
                int max=0;
                if (b[i].getResztav() >= b[max].getResztav())
                {
                    max=i;
                }
                System.out.println(b[max].toString());
            }    
        
    }
    
    
    public static void main(String[] args) {
        int n;
        DateFormat ft;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        bpk = new BudapestKupa[n];
        for (int i=0; i<n; i++)
        {
            
            String sor=sc.nextLine();
            String st[]=sor.split(";");
            Date d = new Date();
            ft = new SimpleDateFormat("YYYY;MM;dd");
            
            
            d.setYear(Integer.parseInt(st[0])-1900);
            d.setMonth(Integer.parseInt(st[1])-1);
            d.setDate(Integer.parseInt(st[2]));
            
            
            
            //összesen 7 résztáv, ahol nincs adat ott a példa bemeneti érték 0 
            int sum = Integer.parseInt(st[4])+Integer.parseInt(st[5])+Integer.parseInt(st[6])+Integer.parseInt(st[7])+Integer.parseInt(st[8])+Integer.parseInt(st[9])+Integer.parseInt(st[10]);
            bpk[i]=new BudapestKupa(ft.format(d), st[3], sum);
            
            
        }       
        
        System.out.println();
        kiir(bpk);
        System.out.println();
        System.out.println("A leghosszabb teljesitendő útvonallal rendelkező túrák:");
        
        kiiratasMaximum(bpk);
        
    }
    
}
