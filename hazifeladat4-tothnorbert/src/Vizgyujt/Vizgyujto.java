/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vizgyujt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class Vizgyujto {
    private String név;
    private List<String> beleFolynak; // Azok a vizgyűjtők, amelyek ebbe a vízgyűjtőbe közvetlenül belefolynak

    public Vizgyujto(String név) {
        this.név = név;
        this.beleFolynak= new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public List<String> getBeleFolynak() {
        return beleFolynak;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    // Szükség van rá a lista contains, indexOf metódusa miatt
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vizgyujto)) 
            return false;
        
        Vizgyujto vz= (Vizgyujto)obj;
        return this.név.equals(vz.getNév());
        
       
    }

    @Override
    public String toString() {
        return "V\u00edzgy\u00fcjt\u0151{" + "n\u00e9v=" + név + ", v=" +  this.beleFolynak.toString() + '}';
    }
    
    
}
