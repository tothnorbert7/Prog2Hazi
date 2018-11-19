/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkolosFeladat;

/**
 *
 * @author Norbert
 */
public class Parkolo implements Comparable<Parkolo>{
    private String cim;
    private double terulet;
    private int kapacitas;
    private String rendszamok;

    public Parkolo(String cim, double terulet, int kapacitas, String rendszamok) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszamok = rendszamok;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public String getRendszamok() {
        return rendszamok;
    }

    public void setRendszamok(String rendszamok) {
        this.rendszamok = rendszamok;
    }

    @Override
    public String toString() {
        return "Parkolo{" + "cim=" + cim + ", terulet=" + terulet + ", kapacitas=" + kapacitas + ", rendszamok=" + rendszamok + '}';
    }

    @Override
    public int compareTo(Parkolo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
