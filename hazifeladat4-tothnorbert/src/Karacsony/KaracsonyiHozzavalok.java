/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karacsony;


/**
 *
 * @author Norbert
 */
public class KaracsonyiHozzavalok implements Comparable<KaracsonyiHozzavalok>{
    private String hozzavalo;
    private int mennyiseg;

    public KaracsonyiHozzavalok(String hozzavalo, int mennyiseg) {
        this.hozzavalo = hozzavalo;
        this.mennyiseg = mennyiseg;
    }

    public String getHozzavalo() {
        return hozzavalo;
    }

    public void setHozzavalo(String hozzavalo) {
        this.hozzavalo = hozzavalo;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return hozzavalo + ";"+mennyiseg;
    }

    @Override
    public int compareTo(KaracsonyiHozzavalok o) {
        if (this.mennyiseg == o.getMennyiseg())
        {
            return this.hozzavalo.compareTo(o.getHozzavalo());
        }
        else
        {
            return Integer.compare(this.mennyiseg, o.getMennyiseg());
        }
        
    }
    
}
