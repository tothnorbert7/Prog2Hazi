package BoltNyilvantarto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Elelmiszer extends Termek{
    private int szavatossag;

    public Elelmiszer(int szavatossag, String nev, String mennyiseg, double egysegar) {
        super(nev, mennyiseg, egysegar);
        this.szavatossag = szavatossag;
    }

    public int getSzavatossag() {
        return szavatossag;
    }

    public void setSzavatossag(int szavatossag) {
        this.szavatossag = szavatossag;
    }

    
    
}
