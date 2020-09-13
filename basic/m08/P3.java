
package basic.m08;
public class P3
{
    public void Complex()
    {
        System.out.println("#1");
        //First half of the pattern
        for (int i = 1; i <= 5; i++) 
        {
            
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            
             
            for (int j = i; j <= 5; j++) 
            { 
                System.out.print(j+" "); 
            } 
             
            System.out.println(); 
        } 
         
        
        //Second half of the pattern
        for (int i = 4; i >= 1; i--) 
        {
           
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            
             
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
        
        System.out.println("#2");
        int alphabet = 65; 
        //First half of the pattern

        for (int i = 0; i <= 4 ; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= 4; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
        
        //Second half of the pattern
        for (int i = 4; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= 4; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
        
        System.out.println("#3");
        
        int k = 5 * 2 - 1;
        //To print x with stars the loops of spaces and stars
 
	for(int i = 1;i <= k;i++)
        {
                    
	   for(int j = 1;j <= k;j++)
                
           {      
               if(j == i || j == k - i + 1)
               {
                   System.out.print("*");
               }
                   System.out.print(" ");
                                 
		 
                    	
               
           }
		 
    
	   System.out.println();
	    
        }            

    }
    
    public static void main()
    {
        P3 ob = new P3();
        ob.Complex();
        
    }
}
        