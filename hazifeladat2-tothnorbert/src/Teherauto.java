
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Teherauto extends Auto {
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher=maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}'+"   ";
    }

@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Teherauto))
        {
            return false;
        }
        Teherauto t = (Teherauto)obj;
        return super.equals(t) && this.equals(t.maxSzallithatoTeher);      
    }    
    
    
    
    
}
