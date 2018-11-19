/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizesFeladat;


/**
 *
 * @author Norbert
 */
public class Auto implements Comparable<Auto>{
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return rendszam+"  "+teljesitmeny+"  "+automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Auto))
            return false;
        
            Auto a = (Auto)obj;
            return this.rendszam.equals(a.getRendszam());
    }

    @Override
    public int compareTo(Auto o) {
        return (-1)*Integer.compare(this.getTeljesitmeny(), o.getTeljesitmeny());
    }
    
    public boolean szabalyosRendszam(Auto o) {
        int betu=0;
        int szam=0;
        
        if (o.getRendszam().length() == 6)
        {
            int i;
            for (i=0; i<3; i++)
            {
                if (!Character.isAlphabetic(i))
                {
                    betu=0;
                }
                else
                {
                    betu=betu+1;
                }
            
            }
            
            for (i=3; i<6; i++)
                {
                    if (!Character.isDigit(i))
                    {
                        szam=0;
                    }
                    else
                    {
                        szam=szam+1;
                    }
                } 
        }
        else
        {
            return false;
        }
        
        if (betu == 3 && szam == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
        
 }
}
