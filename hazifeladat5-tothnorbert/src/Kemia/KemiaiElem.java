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
public abstract class KemiaiElem implements ReakcioKepes {
    private String vegyjel;
    private int rendszam;
    private int focsoport;
    
    
    
    public KemiaiElem(String vegyjel, int rendszam, int focsoport) {
        this.vegyjel = vegyjel;
        this.rendszam = rendszam;
        this.focsoport = focsoport;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public int getRendszam() {
        return rendszam;
    }

    public void setRendszam(int rendszam) {
        this.rendszam = rendszam;
    }

    public int getFocsoport() {
        return focsoport;
    }

    public void setFocsoport(int focsoport) {
        this.focsoport = focsoport;
    }

    
    
    
    
}
