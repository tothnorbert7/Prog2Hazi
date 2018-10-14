
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
public class DiakTest {
    
    private static void pirosKék(Diak[] d, String ki) {

        int piros = 0;
        int kék = 0;
        for (int i = 0; i < d.length; i++)
        {
            if (d[i].getSajatNeve().equals(ki))
            {  
                System.out.println(piros + " " + kék);
                break;

            }
            else if (i % 2 == 0)
            {
                piros++;
            }
            else
            {
                kék++;
            }
        }
    }
    
    private static void rendez(Diak[] d) {

        for (int i = 0; i < d.length - 1; i++)
        {  
            for (int j = i + 1; j < d.length; j++)
            {
                if (d[j].getElozoNeve().equals(d[i].getSajatNeve()) && j > i + 1)
                {
                    Diak tmp = d[i + 1];
                    d[i + 1] = d[j];
                    d[j] = tmp;

                }

            }
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] s = sor.split(";");

        int n = Integer.parseInt(s[0]);
        Diak[] d = new Diak[n];
        d[0] = new Diak(s[1], "");
                                   
        String X = s[2];    

        for (int i = 1; i < n; i++) { 
            sor = sc.nextLine();     
            s = sor.split(";");      
            d[i] = new Diak(s[0], s[1]);    

        }

        rendez(d); 

        for (Diak i : d) {    
            System.out.println(i);
        }
        
        pirosKék(d, X);  
    
    
    }
}
