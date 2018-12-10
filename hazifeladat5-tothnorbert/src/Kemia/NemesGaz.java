/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kemia;

/**
 *
 * @author Norbert
 */
public class NemesGaz extends KemiaiElem{

    public NemesGaz(String vegyjel, int rendszam, int focsoport) {
        super(vegyjel, rendszam, focsoport);
    }

    @Override
    public boolean RakciobaLephet() {
        return false;
    }

    @Override
    public boolean RakciobaLephet2(ReakcioKepes r) {
        return false;
    }
    
}
