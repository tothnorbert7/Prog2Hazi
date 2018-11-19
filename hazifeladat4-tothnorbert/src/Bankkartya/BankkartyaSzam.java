/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankkartya;

import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class BankkartyaSzam {
    
    public static void ervenyesBankkartyaSzam(String szamsor) {
        int[] t = new int[szamsor.length()];
        for (int i=0; i<szamsor.length(); i++)
        {
            t[i] = Integer.parseInt(szamsor.substring(i, i+1));
        }
	for (int i=t.length-2; i>=0; i=i-2)
        {
            int j=t[i];
            j = j*2;
            if (j>9) 
            {
		j = j%10+1;
            }
            t[i] = j;
	}
	int sum=0;
	for (int i=0; i<t.length; i++)
        {
            sum = sum+t[i];
	}
	if (sum%10 == 0)
        {
            System.out.println("YES");
	}
        else
        {
            System.out.println("NO");
	}
}
        
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String szamsor = sc.nextLine();
               
        ervenyesBankkartyaSzam(szamsor);
    }
}
