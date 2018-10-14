/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class Diak {
    
    private String sajatNeve;
    private String elozoNeve;

    public Diak(String sajatNeve, String elozoNeve)
    {
        this.sajatNeve = sajatNeve;
        this.elozoNeve = elozoNeve;
    }

    public String getSajatNeve()
    {
        return sajatNeve;
    }

    public String getElozoNeve()
    {
        return elozoNeve;
    }

    @Override
    public String toString() {
        return "Diak{" + "sajatNeve=" + sajatNeve + ", elozoNeve=" + elozoNeve + '}';
    }
    
    
    
    
    
    
    
    
    
}
