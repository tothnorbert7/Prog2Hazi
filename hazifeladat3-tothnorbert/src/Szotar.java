/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Szotar {
    private String magyarszo;
    private String angolszo;

    public Szotar(String magyarszo, String angolszo)
    {
        this.magyarszo = magyarszo;
        this.angolszo = angolszo;
    }

    public String getMagyarszo()
    {
        return magyarszo;
    }

    public String getAngolszo()
    {
        return angolszo;
    }

    @Override
    public String toString() {
        return magyarszo+":"+angolszo;
    }
    
    
    
    
    
    
}
