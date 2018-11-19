/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HetesFeladatLakoHaz;

import java.util.Objects;

/**
 *
 * @author Norbert
 */
public class Lakohaz implements Comparable<Lakohaz>{
    
    public static final double emeletMagasság= 3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter() {
        return this.alapterulet*this.emeletMagasság*this.emeletMagasság;
    }
    
    public void setAlapterulet(double alapterulet) {
        this.alapterulet = alapterulet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append(":\n");
        sb.append(this.legkobmeter());
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakohaz o) {
        return Double.compare(this.legkobmeter(), o.legkobmeter());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Lakohaz))
            return false;
        
            Lakohaz l = (Lakohaz) obj;
            
            return this.cim.equals(l.getCim());
        
    }
    
}
