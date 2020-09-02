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
               break;
            }
            case 2:
            {
               System.out.println("Tuesday"); 
               break;
            }
            case 3:
            {
               System.out.println("wednesday"); 
               break;
            }
            case 4:
            {
               System.out.println("Thursday"); 
               break;
            }
            case 5:
            {
               System.out.println("Friday"); 
            }
            case 6:
            {
               System.out.println("Saturday"); 
               break;
            }
            case 7:
            {
               System.out.println("Sunday"); 
               break;
            }
            
        } 
        
    }
}