package basic.m08;
public class P2
{
    public void RightAngledTriangle()
    {
        System.out.println("#1");
        
        for(int i = 5; i >= 0; i--)
        {
            //Loop for printing spaces
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            
            //Loop for printing stars
            for(int k = 5; k > i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("#2");
        
        for(int i = 5; i >= 0; i--)
        {
            //Loop for printing stars
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            
            //Loop for printing spaces
            for(int k = 5; k > i; k--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
        System.out.println("#3");
        
        //Loops for first triangle 
        
        for(int i = 5; i >= 0; i--)
        {
            //Loop for printing spaces
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            
            //Loop for printing stars
            for(int k = 5; k > i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Loops for second triangle 
        
        for(int i = 5; i >= 0; i--)
        {
            //Loop for printing spaces
            for(int k = 5; k > i; k--)
            {
                System.out.print(" ");
            }
            
            
            //Loop for printing stars
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
        
        System.out.println("#4");
        
        //Loops for first triangle 
        
        for(int i = 5; i >= 0; i--)
        {
            int w = 1;
            //Loop for printing spaces
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            
            //Loop for printing stars
            for(int k = 5; k > i; k--)
            {
                
                System.out.print(w);
                w = w + 1;
            }
            System.out.println();
        }
        
        //Loops for second triangle 
        
        for(int i = 5; i >= 0; i--)
        {
            int q = 1;
            //Loop for printing spaces
            for(int k = 5; k > i; k--)
            {
                System.out.print(" ");
            }
            
            
            //Loop for printing stars
            for(int j = 0; j <= i; j++)
            {
                
                System.out.print(q);
                q = q + 1;
            }
            
            System.out.println();
        }
        
        
        System.out.println("#5");
        //Loops for first triangle 
        
        for(int i = 1; i <= 5; i++)
        {
            //Loop for printing spaces
            for(int j = 5; j >= i; j--)
            {
                System.out.print(" ");
            }
            
            //Loop for printing stars
            for(int k = 1; k <= i; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        //Loops for second triangle 
        
        for(int i = 4; i >= 1; i--)
        {
            //Loop for printing spaces
            for(int k = 5; k >= i; k--)
            {
                System.out.print(" ");
            }
            
            
            //Loop for printing stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            
            System.out.println();
        }
        
        System.out.println("#6");
        //Loops for first triangle 
        int e = 0;
        for(int i = 1; i <= 4; i++)
        {
            //Loop for printing spaces
            for(int j = 4; j >= i; j--)
            {
                System.out.print(" ");
            }
            
            //Loop for printing stars
            for(int k = 1; k <= i; k++)
            {
                System.out.print(e);
                e = e + 1;
            }
            System.out.println();
        }
        
        //Loops for second triangle 
        int ii = 8; 
        
        for(int i = 3; i >= 1; i--)
        {
            //Loop for printing spaces
            for(int k = 4; k >= i; k--)
            {
                System.out.print(" ");
            }
            
            
            //Loop for printing stars
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ii);
                ii = ii - 1;
            }
            
            System.out.println();
        }
        
       
        
    }
    
    public void TriangleAndRhombus()
    {
        System.out.println("#1");
        int k = 5;
        for (int i = 0; i < 5; i++)
        {
             
            for (int j = 0; j < k; j++)
            {
                
                System.out.print(" ");
            }
            
            k = k - 1;
  
            
            for (int p = 0; p <= i; p++ )
            {
                
                System.out.print("* ");
            }
  
             
            System.out.println();
        }
        
        System.out.println("#2");
        
        for(int i = 5;i > 0 ;i--)
        {
        for(int j = 0;j < 5 - i;j++)
                
            {
                System.out.print(" ");
            }
            for(int j = 0;j < (i * 2) - 1;j++)
                
            {
                System.out.print("*");
            }
            System.out.println();
        } 
        
        System.out.println("#3");
        
        for(int i = 1;i <= 5;i++)
        {
           for(int j = 1;j <= 5 - i;j++)
 
           {
                        System.out.print(" ");
           }
 
           for(int j = 1;j <= i * 2 - 1;j++)
 
           {
                        System.out.print("*");
           }
           System.out.println();
 
        } 
        for(int i = 5 - 1;i > 0;i--)
        {
           for(int j = 1;j <= 5 - i;j++)
 
           {
              System.out.print(" ");
           }
           for(int j = 1;j <= i * 2 - 1;j++)
 
           {
              System.out.print("*");
           }
           System.out.println();
        }
       
    }
     
   
        
        
        
    
    
    public void TriangleAndRhombuswithoutspace()
    {
        System.out.println("#1");
        int k = 5;
        for (int i = 0; i < 5; i++)
        {
             
            for (int j = 0; j < k; j++)
            {
                
                System.out.print(" ");
            }
            
            k = k - 1;
  
            
            for (int p = 0; p <= i; p++ )
            {
                
                System.out.print("* ");
            }
  
             
            System.out.println();
        }
        
         
        System.out.println("#2");
        
        for(int i = 5;i > 0 ;i--)
        {
        for(int j = 0;j < 5 - i;j++)
                
            {
                System.out.print(" ");
            }
            for(int j = 0;j < (i * 2) - 1;j++)
                
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        System.out.println("#3");
        
        for(int i = 1;i <= 5;i++)
        {
           for(int j = 1;j <= 5 - i;j++)
 
           {
                        System.out.print(" ");
           }
 
           for(int j = 1;j <= i * 2 - 1;j++)
 
           {
                        System.out.print("*");
           }
           System.out.println();
 
        } 
        for(int i = 5 - 1;i > 0;i--)
        {
           for(int j = 1;j <= 5 - i;j++)
 
           {
              System.out.print(" ");
           }
           for(int j = 1;j <= i * 2 - 1;j++)
 
           {
              System.out.print("*");
           }
           System.out.println();
        }
    }
    
    public static void main()
    {
        P2 ob = new P2();
        ob.RightAngledTriangle();
        ob.TriangleAndRhombus();
        ob.TriangleAndRhombuswithoutspace();
    }
}