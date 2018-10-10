

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Teszt {
    
    private static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] vend) {
        int count=0;
        for (int i=0; i<vend.length; i++)
        {
            if (vend[i] instanceof Kocsma)
            {
                Kocsma k = (Kocsma)vend[i];
                
                for (int j=0; j<k.getSorlap().length; j++)
                {
                    if (k.getSorlap()[j].equals(ital))
                    {
                        count++;
                    }   
                }            
            }         
        }
        
        Kocsma[] kocsma = new Kocsma[count];
        int x=0;
        for (int i=0; i<vend.length; i++)
        {
            if (vend[i] instanceof Kocsma)
            {
                Kocsma k = (Kocsma)vend[i];
                for (int j=0; i<k.getSorlap().length; j++)
                {
                    if (k.getSorlap()[j].equals(ital))
                    {
                        kocsma[x]=k;
                        x++;
                    }
                    
                }
                
            }
            
        }
        return kocsma;
       
    }
    
    
    public static void main(String[] args) {
        
        VendeglatoipariEgyseg [] vend = new VendeglatoipariEgyseg[] {
         new Etterem("Halaszcsarda", 15, false, new String[]{"Gulyas", "Brassoi"}),
         new Etterem("Oroszlan", 20, false, new String[]{"Sultkrumpli", "Rantotthus"}),
         new Etterem("Csokonai", 50, false, new String[]{"Gulyas","Kaviar"}),
         new Etterem("Beregszászi", 10, false, new String[]{"Sultkrumpli", "Hal"}),
         new Etterem("AranyKaviár", 100, false, new String[]{"Kaviar","Rizs"}),
         
         new Kocsma("AranyKorso", 50, true, new String[]{"Sör", "Whiskey", "Bor"}),
         new Kocsma("Csucsi", 20, true, new String[]{"Vodka", "Pálinka", "Froccs"}),
         new Kocsma("RedPub", 45, true, new String[]{"Pezsgo", "Pálinka", "Whiskey"}),
         new Kocsma("SarkiTakonycsapkodo", 15, true, new String[]{"Sör", "Pálinka", "Bor"}),
         new Kocsma("Fapados", 25, true, new String[]{"Vodka", "Whiskey", "Bor"})  };
       
        
        Kocsma[] kocs = adottItaltKinaloKocsmak("Bor", vend);
        for (Kocsma k:kocs)
        {
            System.out.println(k);
        }
        
    }
}
