package basic.m07;
import java.util.Scanner;
public class P2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers for the series (1*2)+(2*3)+(3*4)...");
        int n1 = sc.nextInt();
        int summ=0;
        for(int i=1;i<=n1;i++)
        {
          summ=summ+(i*(i+1)); 
        }
        System.out.println("enter numbers for the series x^1-x^3+x^5....");
        int sum = 0;

        System.out.println("please enter n:");
        int n = sc.nextInt();
        System.out.println("please enter x:");
        int x = sc.nextInt();
        for(int i = 1; i <= n; i += 2)
        {
            sum += (int)Math.pow(-1, (i-1)/2) * Math.pow(x, i);
        }
        System.out.println("enter numbers for the series 1!-3!+5!...");
        
        System.out.println("enter numbers for the series x^1-x^3+x^5");
        System.out.println("enter numbers for the series x^1-x^3+x^5");
        System.out.println("enter numbers for the series x^1-x^3+x^5");
    }
}
