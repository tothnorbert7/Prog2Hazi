/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoltNyilvantarto;

/**
 *
 * @author Norbert
 */
public class Termek {
    
    private String nev;
    private String mennyiseg;
    private double egysegar;

    public Termek(String nev, String mennyiseg, double egysegar) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
        this.egysegar = egysegar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(String mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public double getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(double egysegar) {
        this.egysegar = egysegar;
    }

    @Override
    public String toString() {
        return "Termek{" + "nev=" + nev + ", mennyiseg=" + mennyiseg + ", egysegar=" + egysegar + '}';
    }
    
    
    
}
