/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Nyilas extends Katona {
    private int lotav;

    public int getLotav()
    {
        return lotav;
    }

    public void setLotav(int lotav)
    {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, int tamadoero, int vedoero)
    {
        super(tamadoero+lotav, vedoero);
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: "+super.getTamadoero()+", VE: "+super.getVedoero();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Nyilas))
        {
            return false;
        }
        Nyilas n = (Nyilas) obj;
        return this.lotav==n.getLotav() && super.getTamadoero()==n.getTamadoero() && super.getVedoero()==n.getVedoero();
    }
    
}
