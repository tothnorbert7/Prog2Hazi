/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkolosFeladat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class main {
    public static List<Parkolo> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        while(sor.length()>0) {
            String[] s = sor.split(";");
            lista.add(new Parkolo(s[0], Double.parseDouble(s[1]), Integer.parseInt(s[2]), s[3]));
        sor = sc.nextLine();
        } 
       
    }
    
}
