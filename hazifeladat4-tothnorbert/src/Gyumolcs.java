/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Gyumolcs {
    private String fajta;
    private String iz;

    public Gyumolcs(String fajta, String iz) {
        this.fajta = fajta;
        this.iz = iz;
    }
    
    public void milyenFajtaju() {
        this.fajta=fajta;
    }
    
    public void milyenIzu() {
        this.iz = iz;
    }

    @Override
    public String toString() {
        return "Gyumolcs{" + "fajta=" + fajta + ", iz=" + iz + '}';
    }
    
}
