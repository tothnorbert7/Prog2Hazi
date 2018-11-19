/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NyolcasFeladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Norbert
 */
public class ValosSzamok implements IRealNumbers{
    
    List<Double> l1 = new ArrayList<>();

    @Override
    public void add(double num) {
        l1.add(num);
    }

    @Override
    public double get(int idx) {
         return l1.get(idx);
    }

    @Override
    public void delete(int idx) {
        l1.remove(idx);
    
    }

    @Override
    public boolean contains(double num) {
        if (l1.contains(num))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int getFirstOccurrence(double num) {
        return l1.indexOf(num);
    }
    
    public static void main(String[] args) {
        List<Double> l1 = new ArrayList<>();
        l1.add(5.4);
        l1.add(10.3);
        l1.add(4.7);
        l1.add(2.1);
        
        for (int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
        l1.remove(4.7);
        System.out.println();
        
        for (int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
        
    }
    
}
