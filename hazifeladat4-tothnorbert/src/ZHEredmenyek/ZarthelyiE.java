/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZHEredmenyek;

/**
 *
 * @author Norbert
 */
public class ZarthelyiE implements Comparable<ZarthelyiE>{
    private String nev;
    private int pont;

    public ZarthelyiE(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return nev+": "+pont+" pont";
    }

    @Override
    public int compareTo(ZarthelyiE o) {
        if (this.pont == o.getPont())
        {
            return this.nev.compareTo(o.getNev());
        }
        else
        {
            return (-1)*Integer.compare(this.pont, o.getPont());
        }
    }
    
    
}
