/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */

    import java.util.Random;

public class Testmetodus {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];
        for (int i = 0; i < t.length; i++)
        {
            t[i] = rnd.nextInt(10);
        }
        printArray(t);
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        
        System.out.println(timeEnd - timeStart);
    }

    static void printArray(int[] a) {
 
        for (int i = 0; i < a.length; i++)
        {
        System.out.print(a[i] + " ");
        }
        System.out.println();
    }
 
    static void insertionSort(int[] a) {
        
        int j, x;
        int n=a.length;
        for (int i=1; i<n; i++)
        {
            x=a[i];
            j=i-1;
            while (j >=0 && a[j]>x)
            {
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1]=x;  
        } 
    }
    
}
