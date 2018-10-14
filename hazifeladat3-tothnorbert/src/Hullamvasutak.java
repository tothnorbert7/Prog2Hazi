/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Hullamvasutak {
    
    private String nev;
    private String vilag;
    private int minmagassag;
    private int varakozas;

    public Hullamvasutak(String nev, String vilag, int minmagassag, int varakozas)
    {
        this.nev = nev;
        this.vilag = vilag;
        this.minmagassag = minmagassag;
        this.varakozas = varakozas;
    }

    public String getNev()
    {
        return nev;
    }

    public String getVilag()
    {
        return vilag;
    }

    public int getMinmagassag()
    {
        return minmagassag;
    }

    public int getVarakozas()
    {
        return varakozas;
    }

    @Override
    public String toString() {
        return nev+" ("+vilag+"): "+varakozas;
    }
    
}
