/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merlegeles;

/**
 *
 * @author Norbert
 */
public class Ceg implements Comparable<Ceg>{
    private String cegnev;
    private String telephely;
    private int ev;
    private int arbevetel;

    public Ceg(String cegnev, String telephely, int ev, int arbevetel) {
        this.cegnev = cegnev;
        this.telephely = telephely;
        this.ev = ev;
        this.arbevetel = arbevetel;
    }

    public String getCegnev() {
        return cegnev;
    }

    public void setCegnev(String cegnev) {
        this.cegnev = cegnev;
    }

    public String getTelephely() {
        return telephely;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getArbevetel() {
        return arbevetel;
    }

    public void setArbevetel(int arbevetel) {
        this.arbevetel = arbevetel;
    }

    @Override
    public String toString() {
        return "Ceg{" + "cegnev=" + cegnev + ", telephely=" + telephely + ", ev=" + ev + ", arbevetel=" + arbevetel + '}';
    }

    @Override
    public int compareTo(Ceg o) {
        if (this.arbevetel == o.getArbevetel())
        {
            return this.cegnev.compareTo(o.getCegnev());
        }
        else
        {
            return Integer.compare(this.arbevetel, o.getArbevetel());
        }
    }
    
}
    

