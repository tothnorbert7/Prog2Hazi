/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AltalanosIskola;

/**
 *
 * @author Norbert
 */
public class Osztalypenz implements Comparable<Osztalypenz>{
    private String nev;
    private int penz;

    public Osztalypenz(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    @Override
    public String toString() {
        return nev+";"+penz;
    }

    @Override
    public int compareTo(Osztalypenz o) {
        if (this.penz == o.getPenz())
        {
            return this.nev.compareTo(o.getNev());
        }
        else
        {
            return (-1)*Integer.compare(this.penz, o.getPenz());
        }
    }
    
    
}
