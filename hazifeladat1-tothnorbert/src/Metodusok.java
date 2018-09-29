
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
public class Metodusok {
    
// 1. feladat:    
    public static void novsorrend(int a, int b, int c)
    {
        int numbers[]={a,b,c};
        Arrays.sort(numbers);
        for (int i=0; i<3; i++)
        {
            System.out.println(numbers[i]);
        }
    }
    
// 2. feladat:
    public static void minimumabsz(double a, double b, double c)
    {
        double szamok[]={a,b,c};
        Arrays.sort(szamok);
        System.out.println("\n");
        System.out.println("Valós számok minimuma: "+szamok[0]);
        
        double x,y,z;
        x=Math.abs(a);
        y=Math.abs(b);
        z=Math.abs(c);
        
        double maximum;
        if (x>=y && x>=z)
        {
            maximum=x;
        }
        else
        {
            if (y>=z && y>=x)
            {
                maximum=y;
            }
            else
            {
                maximum=z;
            }
        }
        
        System.out.println("Abszolút értékeinek maximuma: "+maximum);
    }
    
// 3. feladat:
    public static void sorrend(double a, double b, double c, double d)
    {
        System.out.println("\n");
        System.out.println(a+", "+b+", "+c+", "+d);
        if (d>=0)
        {
            System.out.println(a+", "+c+", "+b+", "+d);
        }
        else
        {
            System.out.println(a+", "+b+", "+d+", "+c);
        }
        
    }
    
// 4. feladat:
    public static boolean haromszog(double a, double b, double c)
    {
        if (a>0 && b>0 && c>0)
        {
            if (a+b>c && a+c>b && b+c>a)
            {
                return true;
            }
        }
        else
        {
            return false;
        }
        return false;
    }

// 5. feladat:
    public static int szokoev(int ev1, int ev2)
    {
        int n=0;
        for (int i=ev1; i<ev2; i++)
        {
            
            if (i%4==0 && i%100!=0 || i%400==0)
            {
                n++;
            }
            
        }
        return n;  
    }
 
// 6. feladat:
    public static void dolgozatjegy(int jegy)
    {
        switch(jegy)
        {
            case 5: System.out.println("Kiváló");
            break;
            
            case 4: System.out.println("Jó");
            break;
            
            case 3: System.out.println("Közepes");
            break;
            
            case 2: System.out.println("Elégséges");
            break;
            
            case 1: System.out.println("Elégtelen");
            break;
            
            default: System.out.println("Nem megfelelő a paraméter.");
        } 
    }
    
// 7. feladat:
    public static double ismkiv(int a, int b)
    {
        double hanyados = 0;
        while (a>=b)
        {
            hanyados=hanyados+1;
            a=a-b;
        }
        return hanyados;
    }
    
// 8. feladat:
    public static void primszam(int szam)
    {
        boolean prim=true;
        for (int i=2; i<=szam-1; i++)
        {
            if (szam%i==0)
            {
                prim=false;
            }   
        }
        if (prim)
        {
            System.out.println("A megadott szám prímszám.");
        }
        else
        {
            System.out.println("A megadott szám nem prímszám.");
        }  
    }
    
 
// 9. feladat:
    public static void Fibonacci(int n)
    {
        int a=1;
        int b=0;
        for (int i=0; i<n; i++)
        {
            System.out.println(b);
            b=a+b;
            a=b-a;
        }
    }
 
    
// 10. feladat:
    public static void szamjegyforditott(int szam)
    {
        int ujszam=0;
        while (szam!=0)
        {
            ujszam=ujszam*10 + szam%10;
            szam=szam/10;
        }
        System.out.println("Számjegyek fordított sorrendben: "+ujszam);    
    }


// 11. feladat:
    public static long faktorialis(int szam)
    {
        if (szam<=12 && szam>=0)
        {    
        long fakt=1;
        for (int i=1; i<=szam; i++)
        {
            fakt=fakt*i;
        }
        return fakt;
        }
        else
        {
            return 0;
        }
        
    }
        
// 12. feladat:
    public static void osztas(int n1, int n2)
    {
        int k=10;
        for (int i=n1+1; i<n2; i++)
        {
            if (i%k==0)
            {
                System.out.println(i);
            }
        }
        
    }

    
// 13. feladat:
    public static int Fibonacci2(int n)
    {
        int a=1;
        int b=0;
        for (int i=0; i<20; i++)
        {
            b=a+b;
            a=b-a;
            if (b>n)
            {
                return b;
            }
        }
        return 0;
        
    }

    
// 14. feladat:
    public static void kobosszeg()
    {
        int i;
        int szam, osszeg, x, kob;
        for (i=1; i<1000; i++)
        {
            szam=i;
            osszeg=0;
            
            do {
                x=szam%10;
                kob=x*x*x;
                osszeg=osszeg+kob;
                szam=szam/10;
            }
            while (szam!=0);
                    {
                        if (osszeg==i)
                        {
                            System.out.println(i);
                        }
                    }
        }
        
    }
    
    
    
    public static void main(String[] args) {
            
        novsorrend(100, 1, 50);
        
        
        minimumabsz(-1.5, 10, -5);
        minimumabsz(11.7, -10, -1.1);
        
        
        sorrend(1, 5, 2, 10);
        sorrend(10, 3, 4, -1);
        
        
        boolean x1=haromszog(4, 5, 12);
        System.out.println(x1);
        
        boolean y1=haromszog(5, 6, 7);
        System.out.println(y1);
        
        boolean z1=haromszog(-5, 1, 3);
        System.out.println(z1);
        
          
        
          System.out.println("Szököévek száma: "+szokoev(2010, 2018));
          System.out.println("Szököévek száma: "+szokoev(1600, 2500));
          
          
          dolgozatjegy(5);
          dolgozatjegy(4);
          dolgozatjegy(3);
          dolgozatjegy(2);
          dolgozatjegy(1);

            
            System.out.println(ismkiv(10, 5));
            System.out.println(ismkiv(8, 2));
            
            
            primszam(11);
            primszam(8);
            primszam(38);
            primszam(101);

            
            Fibonacci(15);

            szamjegyforditott(185);
            szamjegyforditott(614);
            szamjegyforditott(159);
            
            System.out.println(faktorialis(4));
            System.out.println(faktorialis(8));
           
            osztas(10, 100);
            
            
            System.out.println(Fibonacci2(10)); 
            System.out.println(Fibonacci2(55));
            System.out.println(Fibonacci2(200));
            
            
            kobosszeg();
            
            
           
         
    }
    
}
