package basic.m05;
/**1
1. Write a program to check if the given number is a NEON number
2. Write a program to check if the given number is an Armstrong/Narcissistic Number.
3. Write a program to convert a BINARY number to DECIMAL number.
4. Write a program to check if the given number is a PALINDROME.**/

 
import java.util.Scanner;

public class P2

   {
    
        //Declaration
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4;
        int c, sum, o;
        int d, sum1 = 0, k;
        int s, count = 0;
        int rn = 0, p;
        int sum2 = 0;
        
        public void NEON()
        {
            
            
            
            //Prompt and accept a number
            System.out.println("NEON number");
            System.out.println("Enter a number");
            n1 = sc.nextInt();
            
            //Initialization 
            sum = 0;
            o = n1 * n1;
            
            //Loop to find the sum of each digit of o
            while(o > 0)
            {
                c = o % 10;
                sum = sum + c;
                o = o / 10;
            }
            
            
            //Check if sum is same as original number
            if(sum == n1)
            {
                System.out.println("NEON");
            }
            else
            {
                System.out.println("not NEON");
            
            }
        }
            
        public void ARMSTRONG() 
        {
            //Prompt and accept a number
            System.out.println("ARMSTRONG number");
            System.out.println("enter a number");
            n2=sc.nextInt();
            
            //Initialization
            k = n2 * n2 * n2;
            
            //Loop to find the sum of each digit of k
            while(k>0)
            {
                d = k % 10;
                sum1 = sum1 + d;
                k = k / 10;
            }
            
            //Check if sum is same as original number
            if(sum1 == n2)
            {
                System.out.println("ARMSTRONG");
            }
            
            else
            {
                System.out.println("not ARMSTRONG");
            }
        }
        
        
        public void BINARY()
        {
            
            //Prompt and accept a number
            System.out.println("BINARY TO DECIMAL number");
            System.out.println("enter a binary number");
            n3=sc.nextInt();
            
            
            
            //Loop to convert binary to decimal
            while(n3!=0)
            {
                s = n3 % 10;
                sum2 = sum2 + (s * ((int)Math.pow(2, count)));
                count = count + 1;
                n3 = n3 / 10;
            }
            
            System.out.println(sum2);
        }
        
        public void PALINDROME()
        {
            System.out.println("PALINDROME number");
            System.out.println("enter a number");
            n4=sc.nextInt();
            
            
            
            //Loop to convert to itss reverse
            while(n4 != 0)
            {
                p = n4 % 10;
                rn = ( rn * 10 ) + p;
                n4 = n4 / 10;
            }
            
            //Check if reverse is same as original number
            if(rn == n4)
            {
                System.out.println("PALINDROME");
            }
            else
            {
                System.out.println("not PALINDROME");
            }
        }
    }
    
        
        
    
