package basic.m07;
import java.util.Scanner;
/**Part 1 – Until n
1. Program to print the series 1,2,4,8,16,32...n
2. Program to print the series 0,1,3,7,15,31...n
**/

public class P1
{

    
    
    //Declaration
    Scanner sc = new Scanner( System.in );
    int n1;
    int n2;
    int nxt;
    
    public void FirstSeries()
    {
        //Prompt and accept a number
        System.out.println("to print the series 1,2,4,8,16,32...n enter n");
        System.out.println("Enter a number");
        n1 = sc.nextInt();
        
        //Loop to find next in series
        for(int i=1;i<=n1;i=i*2)
        {
            System.out.print(i+",");
        }
        
        
        
        
    }
    
    public void SecondSeries()
    {
        //Prompt and accept a number
        System.out.println("to print the series 0,1,3,7,15,31...n");
        System.out.println("Enter a number");
        n2 = sc.nextInt();
        
        //Loop to find next in series
        for(int i=0;i<=n1;i++)
        {
            nxt = ((int)(Math.pow(2,i))-1);
            System.out.print(nxt+",");
        }
        
        
        
        
    }
    
    //MainFunction
    public static void main()
    {
       P1 ob=new P1();
       ob.FirstSeries();
       ob.SecondSeries();
    }
    
    
    
    
}

 