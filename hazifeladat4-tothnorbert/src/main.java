/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class main {
    
    public static Aszu[] aszuBorok(Bor[] br) {
        int count=0;
        for (int i=0; i<br.length; i++)
        {
            if (br[i] instanceof Aszu)
            {
                Aszu asz = (Aszu)br[i];
                if (asz.hanyPuttonyos() == 5)
                {
                    count++;
                }
                
            }
        }
        
        Aszu[] aszutomb = new Aszu[count];
        int x=0;
        for (int i=0; i<br.length; i++)
        {
            if (br[i] instanceof Aszu)
            {
                Aszu asz = (Aszu)br[i];
                for (int j=0; j<br.length; j++)
                {
                    if (asz.hanyPuttonyos() == 5)
                    {
                        aszutomb[x] = asz;
                        x++;
                    }
                }
                
            }
        }
        return aszutomb;
         
    } 
    
    public static void main(String[] args) {
        Bor [] borok = new Bor[] {
          new Bor("Csabagyöngye", "Eger", "sdfds", 10) {},
          new Bor("Hárslevelű", "Villány", "dsad", 11) {},
          new Aszu(5, "ddsada", "Eger", "hgfg", 13) {},
          new Bor("Hárslevelű", "Eger", "gfdgs", 11) {},
          new Aszu(6, "trdgh", "Eger", "hzdfd", 9) {},
          new Aszu(5, "kjghaze", "Eger", "weewq", 11) {},
        };
        
        for (Bor z:borok)
        {
            System.out.println(z);
        }
        
      
        
//        Aszu[] asz = aszuBorok(borok);
//        for (Aszu k:asz)
//        {
//            System.out.println(k);
//        }
        
    }
    
}
