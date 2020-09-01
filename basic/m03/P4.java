package basic.m03;
import java.util.Scanner;
public class P4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int n;
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            {
               System.out.println("Monday"); 
            }
            case 2:
            {
               System.out.println("Tuesday"); 
            }
            case 3:
            {
               System.out.println("wednesday"); 
            }
            case 4:
            {
               System.out.println("Thursday"); 
            }
            case 5:
            {
               System.out.println("Friday"); 
            }
            case 6:
            {
               System.out.println("Saturday"); 
            }
            case 7:
            {
               System.out.println("Sunday"); 
            }
            
        } 
        
    }
}