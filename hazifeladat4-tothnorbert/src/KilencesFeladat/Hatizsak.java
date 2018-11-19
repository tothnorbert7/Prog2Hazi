/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KilencesFeladat;

/**
 *
 * @author Norbert
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak:    "+"Marka: "+marka+"   |   Urtartalom: "+urtartalom+"   |   Zsebek szama: "+zsebekSzama+"   |   Vizhatlan: "+vizhatlan;
    }

    @Override
    public int compareTo(Hatizsak o) {
        if (this.marka.equals(o.getMarka()))
        {
            return Integer.compare((-1)*this.getZsebekSzama(), o.getZsebekSzama());
        }
        else
        {
            return this.marka.compareTo(o.getMarka());
        }
    }
  
}
