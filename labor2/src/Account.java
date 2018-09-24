
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Account {
    private int id;
    private double balance;
    private static double Rate=0;
    private Date dateC;
    
    public static double getRate()
    {
        return Rate;
    }
    
    
}
