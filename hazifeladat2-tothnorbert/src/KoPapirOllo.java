/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
import java.util.Scanner; 
//import java.util.Random; 

public class KoPapirOllo {
    public static void main(String[] args) {
        
        String user;
        String gep = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ko, Papir vagy Ollo? ");
        while (!"Vege".equals(user=sc.nextLine()))
        {
            if ("Ko".equals(user) || "Papir".equals(user) || "Ollo".equals(user))
            {
                
            System.out.println("Te választásod: "+user);
            
            int x=(int)(Math.random()*3);
            if (x==0)
            {
                gep="Ko";
                System.out.println("A gép választása: "+gep);
            }
            if (x==1)
            {
                gep="Papir";
                System.out.println("A gép választása: "+gep);
            }
            if (x==2)
            {
                gep="Ollo";
                System.out.println("A gép választása: "+gep);
            }
            
            if ("Ko".equals(user) && "Papir".equals(gep) || "Papir".equals(user) && "Ollo".equals(gep) || "Ollo".equals(user) && "Ko".equals(gep))
            {
                System.out.println("Vesztettél!");
            }
            if (user.equals(gep))
            {
                System.out.println("Döntetlen!");
            }
            else if ("Papir".equals(user) && "Ko".equals(gep) || "Ollo".equals(user) && "Papir".equals(gep) || "Ko".equals(user) && "Ollo".equals(gep))
            {
                System.out.println("Nyertél!");
            }
           
            System.out.println();
            System.out.println("Ko, Papir vagy Ollo? ");
           
            }
            else
            {    
                System.out.println("Nem megfelelo valasztas. (Csak 'Ko', 'Papir' vagy 'Ollo' lehetséges. 'Vege' szó esetén a program véget ér.)");
            }
        }
        
        
        
//        String user;
//        
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Ko, Papir vagy Ollo? ");
//            user = sc.nextLine();
//            System.out.println("A Te választásod: "+user);
//            
//            
//            String gep;
//            int x=(int)(Math.random()*2);
//            if (x==0)
//            {
//                gep="Ko";
//                System.out.println("A gép választása: "+gep);
//            }
//            if (x==1)
//            {
//                gep="Papir";
//                System.out.println("A gép választása: "+gep);
//            }
//            if (x==2)
//            {
//                gep="Ollo";
//                System.out.println("A gép választása: "+gep);
//            }    
//            
//            
//        } while (user.equals("Vége"));
        
            
            
            
        }
    }
          
    
            
    
    
    
    
    
    

