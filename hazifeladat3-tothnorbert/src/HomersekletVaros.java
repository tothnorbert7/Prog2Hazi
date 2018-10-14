
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class HomersekletVaros {
    private String telepulesnev;
    private int homerseklet;

    public HomersekletVaros(String telepulesnev, int homerseklet)
    {
        this.telepulesnev = telepulesnev;
        this.homerseklet = homerseklet;
    }

    public String getTelepulesnev()
    {
        return telepulesnev;
    }

    public int getHomerseklet()
    {
        return homerseklet;
    }

    @Override
    public String toString()
    {
        return telepulesnev+" ("+homerseklet+")";
        
    }
 
}
