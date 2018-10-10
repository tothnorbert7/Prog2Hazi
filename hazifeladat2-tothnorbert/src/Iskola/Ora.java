/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;



/**
 *
 * @author Norbert
 */


public class Ora {
    private int kod;
    private String nev;
    private int kezdete;

    public Ora(int kod, String nev, int kezdete)
    {
        if (this.kezdete>=8 && this.kezdete<=19)
        {
            this.kezdete=kezdete;
        }
        if (this.kezdete<8)
        {
            this.kezdete=8;
        }
        if (this.kezdete>19)
        {
            this.kezdete=19;
        }
        
        this.kod = kod;
        this.nev = nev;
        
    }

    public int getKod()
    {
        return kod;
    }

    public String getNev()
    {
        return nev;
    }

    public int getKezdete()
    {
        return kezdete;
    }

    public void setKod(int kod)
    {
        this.kod = kod;
    }

    public void setNev(String nev)
    {
        this.nev = nev;
    }

    public void setKezdete(int kezdete)
    {
        this.kezdete = kezdete;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", kezdete=" + kezdete + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Ora))
        {
            return false;
        }
        Ora o = (Ora) obj;
        return this.kod == o.getKod();
    }
    
    
    
    
}
