/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TizesFeladat;

/**
 *
 * @author Norbert
 */
public class Teherauto extends Auto{
    private int teherbiras;

    public Teherauto(String rendszam, int teljesitmeny, boolean automata, int teherbiras) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    @Override
    public String toString() {
        return "Teherbiras: " + teherbiras + "  |  Rendszam: " + super.getRendszam()+ "  |  Teljesitmeny: "+super.getTeljesitmeny() + "  |  Automata: " + super.isAutomata();
    }
    
    
    
    
    
}
