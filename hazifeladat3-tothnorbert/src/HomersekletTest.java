
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
public class HomersekletTest {
    
    private static void kiiratas(HomersekletVaros[] hmv)
        {
            for (int i=0; i<hmv.length; i++)
            {
                System.out.println(hmv[i]);
            }
        }
    
    public static void main(String[] args) {
        int n;
        String varos;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        varos = sc.nextLine();
        
        HomersekletVaros[] hmv = new HomersekletVaros[n];
        for (int i=0; i<n; i++)
        {
            String sor=sc.nextLine();
            String st[]=sor.split(":");
            hmv[i]=new HomersekletVaros(st[0], Integer.parseInt(st[1]));
        }
        
        System.out.println();
        for (int i=0; i<n; i++)
        {
            System.out.println(hmv[i].toString());
        }
        
//        for (int i=0; i<hmv.length; i++)
//        {
//           if (hmv[i].getTelepulesnev().equals(varos))
//           {
//               System.out.println(hmv[i].toString());
//           }
//           else
//           {
//               System.out.println("Missing data");
//           } 
//        }
        
      
    }
    
}
