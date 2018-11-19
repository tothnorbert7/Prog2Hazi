/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class Teszt {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        Hallgato[] hallg = new Hallgato[n];
        for (int i=0; i<n; i++)
        {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            hallg[i] = new Hallgato(Integer.parseInt(st[0]), Boolean.parseBoolean(st[1]));
        }
        
        for (int i=0; i<n; i++)
        {
            
            hallg[i].dolgozatotIr().megfelel();
            if (hallg[i].dolgozatotIr().megfelel() == true)
            {
                System.out.println("Negfelelt");
            }
            else
            {
                System.out.println("Nem felelt meg");
            }
        }
        
    }
}
