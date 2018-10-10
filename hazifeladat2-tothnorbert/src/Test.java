
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Test {
    
    public static void rendezMaxTeher(Teherauto[] teher)
    {
        for (int i=0; i<teher.length; i++)
        {
            for (int j=i+1; j<teher.length; j++)
            {
                if (teher[i].getMaxSzallithatoTeher() <= teher[j].getMaxSzallithatoTeher())
                {
                    Teherauto tmp=teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
                
            }
            
        }
        
    }
    
    public static void keresMax(Auto[] aut)
    {
      
        int max=0;
        for (int i=1; i<aut.length; i++)
        {
            if (aut[i].getMotorTeljesitmeny() >= aut[max].getMotorTeljesitmeny())
            {
                i=max; 
            }
        }
        
        System.out.println("MAX: "+aut[max]);
       
    }
    
    
    public static void main(String[] args) {
        Auto [] car = new Auto[] {
           new Auto("ASD1234", 100),
           new Auto("ASD1235", 80),
           new Auto("ASD1236", 85), 
           new Auto("ASD1237", 90), 
           new Auto("ASD1238", 120),
           
           new Teherauto("BSC1234", 400, 10),
           new Teherauto("BSC1235", 390, 25),
           new Teherauto("BSC1236", 250, 150),
           new Teherauto("BSC1237", 450, 20),
           new Teherauto("BSC1238", 320, 40)   };
        
        Teherauto [] teherauto = new Teherauto[]{
           new Teherauto("BSC1239", 250, 10),
           new Teherauto("BSC1240", 390, 30),
           new Teherauto("BSC1241", 330, 150),
           new Teherauto("BSC1242", 450, 20),
           new Teherauto("BSC1243", 310, 45)   };
        
        rendezMaxTeher(teherauto);
        System.out.println(Arrays.toString(teherauto));
        keresMax(car);
        
    }
         
 }
           

