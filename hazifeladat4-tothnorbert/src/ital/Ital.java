/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;


/**
 *
 * @author Norbert
 */
public class Ital implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + " dl, " + ar + " Ft";
    }    

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Ital))
        {
            return false;
        }
        Ital i = (Ital) obj;
        return this.nev.equals(i.getNev()) && this.kiszereles==(i.getKiszereles());
    }

    @Override
    public int compareTo(Ital o) {
        
        if (this.ar == o.getAr())
        {
            return this.nev.compareTo(o.getNev());
        }
        else
        {
            return Integer.compare(ar, ar);
        }
    }
    
    
    
}
