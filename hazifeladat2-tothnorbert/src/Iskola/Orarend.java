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
public class Orarend {
    private String nap;
    private Ora[] orak;
    private int szamlalo;

    public Orarend(String nap) {
        if (this.nap=="hétfő" || this.nap=="kedd" || this.nap=="szerda" || this.nap=="csütörtök" || this.nap=="péntek")  
        {    
            this.nap = nap;
        }
        szamlalo=0;
        
    }

    public String getNap()
    {
        return nap;
    }

    public void setNap(String nap)
    {
        this.nap = nap;
    }

    public Ora[] getOrak()
    {
        return orak;
    }

    public void Ora(Ora[] orak)
    {
        this.orak = orak;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo)
    {
        this.szamlalo = szamlalo;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", orak=" + orak + ", szamlalo=" + szamlalo + '}';
    }
    
    public boolean oratHozzaad(Ora or) {
        if (this.szamlalo>=12)
        {
            return false;
        }
        else
        {
            for (int i=0; i<this.szamlalo; i++)
            {
                if (this.orak[i].equals(or))
                {
                    return false;
                }
                if (this.orak[i].getKezdete()==or.getKezdete())
                {
                    return false;
                }
                
            }
            this.orak[this.szamlalo]=or;
            this.szamlalo++;
            return true;
        }
        
    }
    
}
