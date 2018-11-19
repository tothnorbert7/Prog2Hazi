/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import Egyetem.IPontozhato;

/**
 *
 * @author Norbert
 */
public class Dolgozat implements IPontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelel() {
        if (this.pontszam > 35)
        {
            return true;
        }
        if (this.pontszam == -1)
        {
            System.out.println("Nem írt");
            return false;
        }
        else
        {
            return false;
        }
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }
    
}
