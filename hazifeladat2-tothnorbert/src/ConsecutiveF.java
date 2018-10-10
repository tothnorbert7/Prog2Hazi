/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norbert
 */
public class ConsecutiveF {
    
    public static boolean isConsecutiveFour(int[] values) {
      int count=0;
      int n=values.length;
      if (values.length>=4)
      {    
        for (int i=0; i<=n; i++)
        {
            if (values[i] == values[i+1])
            {
                count=count+1;
            }
            else
            {
                count=0;
            }

        }
        
        if (count==3)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    else
    {
       return false;   
    }      
  }   
   
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,5,1,5,6,7};
        boolean x1=isConsecutiveFour(values);
        System.out.println();
        System.out.println("Van-e egymást követő négy azonos elem? "+x1);
        
        
        
    }
    
}
