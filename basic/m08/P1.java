package basic.m08;
import java.util.Scanner;

public class P1
{
    public void Square()
    {
        System.out.println("Square");
        
        System.out.println("#1");
        //Loops to print pattern
        for (int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("#2");
        //Loops to print pattern
        for (int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
        
        System.out.println("#3");
        //Loops to print pattern
        for (int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("#4");
        //Loops to print pattern
        for (int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println("#5");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println("#6");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 4; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("#7");
        //Loops to print pattern
        //Initialisation
        int k = 1;
        for (int i = 4; i >= 3; i--)
        {
            for(int j = 4; j >= 1; j--)
            {
                System.out.print(k);
                k = k + 1;
            }
            System.out.println();
        }
        
        System.out.println("#8");
        //Loops to print pattern
        //Initialisation
        int m = 8;
        for (int i = 4; i >= 3; i--)
        {
            for(int j = 4; j >= 1; j--)
            {
                System.out.print(m);
                m = m - 1;
            }
            System.out.println();
        }
        
        System.out.println("#9");
        //Loops to print pattern
        
        for (int i = 1; i < 5; i++)
        {
            for(int j = 65; j < 69; j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
        
        System.out.println("#10");
        //Loops to print pattern
        for (int i = 65; i < 69; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
        
        System.out.println("#11");
        //Loops to print pattern
        //Initialisation
        int y = 65;
        for (int i = 65; i < 69; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print((char)y);
                y = y + 1;
            }
            System.out.println();
        }
        
        System.out.println("#12");
        //Loops to print pattern
        //Initialisation
        int z = 90;
        for (int i = 65; i < 69; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                System.out.print((char)z);
                z = z - 1;
            }
            System.out.println();
        }
    }
    
    public void RightAngledTriangle()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("RightAngledTriangle");
        System.out.println("#1");
        //Loops to print pattern
        
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("#2");
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
        
        System.out.println("#3");
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("#4");
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println("#5");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println("#6");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("#7");
        //Loops to print pattern
        int k = 1;
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(k);
                k = k + 1;
            }
            System.out.println();
        }
        
        System.out.println("#8");
        //Loops to print pattern
        int m = 9;
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(m);
                m = m - 1;
            }
            System.out.println();
        }
        
        System.out.println("#9");
        //Loops to print pattern
        for (int i = 65; i <= 68; i++)
        {
            for(int j = 65; j <= i; j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
        
        System.out.println("#10");
        //Loops to print pattern
        for (int i = 65; i <= 68; i++)
        {
            for(int j = 65; j <= i; j++)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
        
        System.out.println("#11");
        //Loops to print pattern
        int y = 65;
        for (int i = 65; i <= 68; i++)
        {
            for(int j = 65; j <= i; j++)
            {
                System.out.print((char)y);
                y = y + 1;
            }
            System.out.println();
        }
        
        System.out.println("#12");
        //Loops to print pattern
        int z = 90;
        for (int i = 65; i <= 68; i++)
        {
            for(int j = 65; j <= i; j++)
            {
                System.out.print((char)z);
                z = z - 1;
            }
            System.out.println();
        }
    }
    
    public void ReversedRightAngledTriangle()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("ReversedRightAngledTriangle");
        System.out.println("#1");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
        System.out.println("#2");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("2");
                
            }
            System.out.println();
        }
        
        System.out.println("#3");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
        
        System.out.println("#4");
        //Loops to print pattern
        for (int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
                
            }
            System.out.println();
        }
        
        System.out.println("#5");
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(i);
                
            }
            System.out.println();
        }
        
        System.out.println("#6");
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
        
        System.out.println("#7");
        //Loops to print pattern
        int r = 0;
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print(r);
                r = r + 1;
            }
            System.out.println();
        }
        
        System.out.println("#8");
        //Loops to print pattern
        for (int i = 68; i >= 65; i--)
        {
            for(int j = 65; j <= i; j++)
            {
                System.out.print((char)j);
                
            }
            System.out.println();
        }
        
        System.out.println("#9");
        //Loops to print pattern
        for (int i = 65; i <= 68; i++)
        {
            for(int j = 68; j >= i; j--)
            {
                System.out.print((char)i);
                
            }
            System.out.println();
        }
        
        System.out.println("#10");
        int p = 65;
        //Loops to print pattern
        for (int i = 1; i <= 4; i++)
        {
            for(int j = 4; j >= i; j--)
            {
                System.out.print((char)p);
                p = p + 2;
            }
            System.out.println();
        }
    }
    
    public void CombinedRightAngledTriangle()
    {
        System.out.println("#1");
        //Loops to print pattern first triangle
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print("*"); 
            }
            System.out.println();
        }
        //Loop to print second triangle
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print("*"); 
            }
            System.out.println();
        }
        
        System.out.println("#2");
        //Loops to print pattern first triangle
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(j); 
            }
            System.out.println();
        }
        //Loop to print second triangle
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(j); 
            }
            System.out.println();
        }
        
        System.out.println("#3");
        //Loops to print pattern first triangle
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(i); 
            }
            System.out.println();
        }
        //Loop to print second triangle
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(i); 
            }
            System.out.println();
        }
        
        System.out.println("#4");
        //Loops to print pattern first triangle
        int w = 1;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(w); 
               w = w + 1;
            }
            System.out.println();
        }
        //Loop to print second triangle
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(w); 
               w = w + 1; 
            }
            System.out.println();
        }
        
        System.out.println("#5");
        //Loops to print pattern first triangle
        int fl = 65;
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print((char)fl); 
               fl = fl + 1;
            }
            System.out.println();
        }
        //Loop to print second triangle
        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print((char)fl); 
               fl = fl + 1;
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        P1 ob = new P1();
        ob.Square();
        ob.RightAngledTriangle();
        ob.ReversedRightAngledTriangle();
        ob.CombinedRightAngledTriangle();
    }
}