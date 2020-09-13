package basic.m07;
/**
1. Program to find the sum of the series (1*2)+(2*3)+(3*4)...n
2. Program to find the sum of the series x^1-x^3+x^5...n
3. Program to find the sum of the series 1!-3!+5!...n
4. Program to find the sum of the series 1-(x^2/2!)+(x^4/4!)-(x^6/6!)...n
5. Program to find the sum of the series 1+(1+2)+(1+2+3)+(1+2+3+4)+...... +n
6. Program to find the sum of the series 1−(1∗2)+(1∗2∗3)−(1∗2∗3∗4)+⋯ +n
7. Program to find the sum of the series 1-(1+2)/(1∗2)+(1+2+3)/(1∗2∗3)-(1+2+3+4)/(1∗2∗3∗4)+...... +n
 **/

import java.util.Scanner;
public class P2

{
    //Declaration
    Scanner sc = new Scanner(System.in);
    
    public void FirstSeries()
    {
        //Initializations
        int a = 1;
        int b = 2;
        int sum1 = 0;
        
        //Prompt and accept a number
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        
        //Loop to find next in series and sum it
        for(int i = 1; i < n1; i++)
        {
           sum1 = sum1 + (a*b);
           a = b;
           b = b + 1;
        }
        
        System.out.println(sum1);
    }
    
    public void SecondSeries()
    {
        //Initializations
        int sum2 = 0;
        int count = 1;
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n2 = sc.nextInt();
        System.out.println("Enter a number x");
        int x2 = sc.nextInt();
        
        
        //Loop to find next in series and sum it
        for(int i = 1; i <= n2; i=i+2)
        {
            if(count%2==0)
            {
                   
                sum2 = sum2 - ((int)Math.pow(x2,i));
                
            }
            
            if(count%2!=0)
            {
                   
                sum2 = sum2 + ((int)Math.pow(x2,i));
                
            }
           
            count = count + 1;
        }
        
        
        
        
        
        System.out.println(sum2);
    }
    
    public void ThirdSeries()
    {
        //Initializations
        int sum3 = 0;
        int fact = 1;
        int count = 1;
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n3 = sc.nextInt();
        
        //Loop till n and summing
        for(int i = 1; i <= n3; i = i + 2)
        {
            
            //Loop finding factorial 
            for(int j = 1; j <= i; j++)
            {
               fact = fact * j; 
            }
            
            if(count%2==0)
            {
               sum3 = sum3 - fact; 
            }
            
            if(count%2!=0)
            {
                sum3 = sum3 + fact; 
            }
            
            count = count + 1;
            fact = 1;
        }
        
        System.out.println(sum3);
    }
    
    public void FourthSeries()
    {
        //Initializations
        int sum4 = 1;
        int fact = 1;
        int count = 1;
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n3 = sc.nextInt();
        System.out.println("Enter a number x");
        int x1 = sc.nextInt();
        
        //Loop to find next in series and sum it
        for(int i = 2; i <= n3; i=i+2)
        {
            //Loop finding factorial 
            for(int j = 1; j <= i; j++)
            {
               fact = fact * j; 
            }
            
            
            if(count%2==0)
            {
                   
                sum4 = sum4 + (((int)((int)Math.pow(x1,i))/fact));
                
            }
            
            if(count%2!=0)
            {
                   
                sum4 = sum4 - (((int)((int)Math.pow(x1,i))/fact));
                
            }
            
            fact = 1;
           
            count = count + 1;
        }
        
        
        System.out.println(sum4);
    }
    
    public void FifthSeries()
    {
        //Initializations
        int a = 1;
        int b = 2;
        int sum = 1;
        int c = 0;
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        
        //Loop to find next in series and sum it
        for(int i = 1; i < n; i++)
        {
           c = a + b;
           a = c;
           b = b + 1;
           sum = sum + c; 
        }
        
        
        
        
        System.out.println(sum);
    }
    
    public void SixthSeries()
    {
        //Initializations
        int a = 1;
        int b = 2;
        int c = 0;
        int sum = 1;
        
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        
        //Loop to find next in series and sum it
        for(int i = 1; i < n; i++)
        {
           c = a * b;
           a = c;
           b = b + 1;
           
           if(i%2 != 0)
            {
                   
                sum = sum - c; 
                
            }
            
           if(i%2 == 0)
            {
                   
                sum = sum + c; 
                
            }
           
           
           
        }
        
        System.out.println(sum);
    }
    
    public void SeventhSeries()
    {
        //Initializations
        int a = 1, b = 2, c = 1, d = 2;
        int sum = 1;
        int prod = 1;
        int su = 0;
        
        //Prompt and accept a numbers
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        
        //Loop to find next in series and sum it
        for(int i = 1; i <= n; i++)
        {
           prod = a * b;
           su = c + d;
           a = prod;
           c = su;
           b = b + 1;
           d = d + 1;
           
           if(i%2 == 0)
            {
                   
                sum = sum + (int)(su/prod); 
                
            }
            
           if(i%2 != 0)
            {
                   
                sum = sum - (int)(su/prod); 
                
            }
           
           
        }
        
        
        System.out.println(sum);
    }
    
    public static void main()
    {
        P2 ob = new P2();
        ob.FirstSeries();
        ob.SecondSeries();
        ob.ThirdSeries();
        ob.FourthSeries();
        ob.FifthSeries();
        ob.SixthSeries();
        ob.SeventhSeries();
    }
    
}
