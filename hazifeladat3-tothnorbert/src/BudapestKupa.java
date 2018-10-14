
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class BudapestKupa {
    private String datum;
    private String turaneve;
    private int resztav;

    public BudapestKupa(String datum, String turaneve, int resztav) {
        this.datum = datum;
        this.turaneve = turaneve;
        this.resztav = resztav;
    }

    public String getDatum()
    {
        return datum;
    }

    public String getTuraneve()
    {
        return turaneve;
    }

    public int getResztav()
    {
        return resztav;
    }

    @Override
    public String toString() {
        return datum+";"+turaneve;
    }
    
    
    
    
    
}
