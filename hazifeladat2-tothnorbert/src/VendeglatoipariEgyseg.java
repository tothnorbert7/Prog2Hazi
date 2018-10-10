/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class VendeglatoipariEgyseg {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;
    
    public VendeglatoipariEgyseg(String nev, int ferohelyekSzama, boolean dohanyzo)
    {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }
    
    public boolean isDohanyzo()
    {
        return dohanyzo;
    }

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg{" + "nev=" + nev + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo + '}';
    }
    
}
