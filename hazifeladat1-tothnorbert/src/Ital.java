
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar;
    protected Date gyartasiDatum;
    
    public Ital(String nev, String kiszereles, int ar)
    {
        this.nev=nev;
        this.kiszereles=kiszereles;
        this.ar=10;
        this.gyartasiDatum=new Date();
    }

    public String getNev()
    {
        return nev;
    }

    public String getKiszereles()
    {
        return kiszereles;
    }

    public static int getAr()
    {
        return ar;
    }

    public Date getGyartasiDatum()
    {
        return gyartasiDatum;
    }

    public static void setAr(int ar)
    {
        Ital.ar = ar;
    }

    @Override
    public String toString()
    {
        return "Ital: "+nev+", "+kiszereles+" dl, "+ar+" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.kiszereles, other.kiszereles)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }
    
    public static double getArEuroban()
    {
        return Ital.ar/320;
    }
    
}