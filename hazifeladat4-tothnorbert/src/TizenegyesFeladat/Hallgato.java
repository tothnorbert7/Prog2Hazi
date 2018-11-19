/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizenegyesFeladat;

/**
 *
 * @author Norbert
 */
public class Hallgato extends Szemely implements Comparable<Szemely>{
    private double atlag;
    public static final int JO_KEPESSEGU_ATLAG=4;

    public Hallgato(double atlag, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNev()).append(" \n").append(getEletkor()).append(" \n").append(isFerfi()).append(" \n").append(atlag);
        return sb.toString();
    }
    
    
    
    public boolean JoKepessegu() {
        if (atlag >= JO_KEPESSEGU_ATLAG)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    
    
    
    
    
    
    
}
