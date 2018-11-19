/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

/**
 *
 * @author Norbert
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanult;
    private int psz;

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        //super(pontszam);
        if (this.mennyitKeszult >= 0 && this.mennyitKeszult <= 5)
        {
            this.mennyitKeszult = mennyitKeszult;
        }
        this.sokatTanult = sokatTanult;
    }
    
    public Dolgozat dolgozatotIr() {
        if (this.sokatTanult == true)
        {
            int random =(int) ((Math.random()*7)+4);
            psz=random*this.mennyitKeszult;
            
            Dolgozat d = new Dolgozat(psz);
            return d;
        }
        else
        {    
                int random1 =(int) ((Math.random()*5));
                psz=random1*this.mennyitKeszult;  
                Dolgozat d = new Dolgozat(psz);
                return d;
        }
        
    }
    
    
    
    
}
