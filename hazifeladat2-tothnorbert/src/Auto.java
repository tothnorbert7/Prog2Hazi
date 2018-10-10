
import java.util.Date;
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
public class Auto {
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma;

    public Auto(String rendszam, int motorTeljesitmeny)
    {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasDatuma = gyartasDatuma;
    }

    public String getRendszam()
    {
        return rendszam;
    }

    public int getMotorTeljesitmeny()
    {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma()
    {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam)
    {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", motorTeljesitmeny=" + motorTeljesitmeny + ", gyartasDatuma=" + gyartasDatuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Auto))
        {
            return false;
        }
        Auto a = (Auto) obj;
        return this.rendszam.equals(a.getRendszam()) && this.motorTeljesitmeny==(a.getMotorTeljesitmeny());
      
    }

    
    
    
    
    
    
    
    
    
}
