package advanced.M11;
import java.util.Scanner;
import java.io.*;
/**1. Write a program to read an array of integers from the user (BlueJ method), find the sum of all odd array elements and display the 
sum.
2. Write a program to input an array of n integers and find the sum of all the even elements and
odd elements separately.
3. Write a program to input an array of n integers. Replace all even array elements with its square-
root and odd elements with its square.*/
public class P1
{
    Scanner sc = new Scanner(System.in);
    public void BJMethod()
    {
        int m[] = new int[10];
        int sum = 0;
        //Entering elements into array
        System.out.println("Enter 10 elements");
        for( int i = 0; i <= 9; i++)
        {
            m[i] = sc.nextInt();
        }
        
        //sum of odd elements
        for( int i = 0; i <= 9; i++)
        {
            if (m[i] % 2 != 0)
            {
              sum = sum + m[i];  
            }
        }
        
        System.out.println(sum);
    }
    
    public void SumOfOandEelements()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        int m[] = new int[10];
        int SumOfOdd = 0;
        int SumOfEven = 0;
        //Entering elements into array
        System.out.println("Enter 10 elements");
        for( int i = 0; i <= 9; i++)
        {
            m[i] = Integer.parseInt(br.readLine());
        }
        
        //sum of odd elements
        for( int i = 0; i <= 9; i++)
        {
            if (m[i] % 2 != 0)
            {
              SumOfOdd = SumOfOdd + m[i];  
            }
            
            if (m[i] % 2 == 0)
            {
              SumOfEven = SumOfEven + m[i];  
            }
        }
        
        System.out.println(SumOfOdd);
        System.out.println(SumOfEven);
    }
    
    public void RootOfOddSqOfEven()throws IOException
    {
        
    
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        int m[] = new int[10];
        
        //Entering elements into array
        System.out.println("Enter 10 elements");
        for( int i = 0; i <= 9; i++)
        {
            m[i] = Integer.parseInt(br.readLine());
        }
        
        //sum of odd elements
        for( int i = 0; i <= 9; i++)
        {
            if (m[i] % 2 != 0)
            {
              m[i] = (int)Math.sqrt(m[i]);  
            }
            
            if (m[i] % 2 == 0)
            {
              m[i] = m[i] * m[i];  
            }
        }
        int a =0;
        for( int i = 0; i <= 9; i++)
        {
            a = m[i];
            System.out.println(a);
        }
    }
    //calling the functions
    
    public static void main()throws IOException
    {
        P1 ob = new P1();
        ob.BJMethod();
        ob.SumOfOandEelements();
        ob.RootOfOddSqOfEven();
    }
    
}

