package advanced.M11;
import java.util.Scanner;
/**
1. Write a program to generate first n Tribonacci numbers and store it in an array and then display the array.

2. Write a program that reverses an array and stores it in a new array.

3. Write a program to input the marks of n subjects and find the second highest and second lowest
marks.

4. Write a program to accept two arrays of size n and generate a third array as shown in example.
Example:
First array = {10, 20, 30, 40, 50}
Second Array = {100, 200, 300, 400, 500}
Third Array = {10, 100, 20, 200, 30, 300, 40, 400, 50, 500}
*/


public class P2
{
    //Declaration
    Scanner sc = new Scanner(System.in);
    public void tribonacci()
    {
        // initalisation
        int n;
        int a = 0, b = 0, c = 1, sum = 0;
        System.out.println("Enter n");
        n = sc.nextInt();
        int l[] = new int[n];
        l[0] = 0;
        l[1] = 0;
        l[2] = 1;
        //loop for array
        
        for(int i = 3; i < n; i++)
        {
          sum = a + b + c; 
          l[i] = sum;
          a = b;
          b = c;
          c = sum;
          
        }
        int x = 0;
        for(int i = 0; i < n; i++)
        {
          x = l[i];
          System.out.println(x);
          
        }
        
        
    }
    
    public void ReverseInSameArray()
    {
        // initalisation
        
        int n, k;
        System.out.println("Enter number of elements in list");
        n = sc.nextInt();
        int l[] = new int[n];
        //loop for array reverse
        for(int i = 0; i < n; i++)
        {
          l[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n/2; i++)
        {
          k = l[i];
          l[i] = l[n-i-1];
          l[n-i-1] = k;
        }
        
        int x = 0;
        for(int i = 0; i < n; i++)
        {
          x = l[i];
          System.out.println(x);
          
        }
        
    }
    
    
    public void SecondHighest()
     {
        // initalisation
        int n;
        int highest = 0, lowest = 0 ;
        System.out.println("Enter number of elements in list");
        n = sc.nextInt();
        int l[] = new int[n];
        int m[] = new int[n-2]; 
        
       //loop for array to find highest
        for(int i = 0; i < n; i++)
        {
          l[i] = sc.nextInt();
        }
        highest = l[0];
        lowest = l[0];
        for(int i = 0; i < n; i++)
        {
          if(highest < l[i])
          {
              highest = l[i];
          }
          
          if(lowest > l[i])
          {
              lowest = l[i];
          }
        }
        int fl = 0;
        for(int i = 0; i < n; i++)
        {
            if(l[i] != highest && l[i] != lowest)
            {
               m[fl] = l[i];
               fl = fl + 1; 
            }
        }
        //loop for array to find 2nd highest
        int seclowest = m[0];
        int sechighest = m[0];
        for(int i = 0; i < n-2; i++)
        {
          if(sechighest < m[i])
          {
              sechighest = m[i];
          }
          
          if(seclowest > m[i])
          {
              seclowest = m[i];
          }
        }
        
        System.out.println("Second highest is"+sechighest);
        System.out.println("Second lowest is"+seclowest);
    }
    
     public void Merge()
    {
        // initalisation
        int n1, n2;
        System.out.println("Enter number of elements in list1");
        n1 = sc.nextInt();
        int l[] = new int[n1];
        System.out.println("Enter  elements");
        for(int i = 0; i < n1; i++)
        {
          l[i] = sc.nextInt();
        }
        
        System.out.println("Enter number of elements in list2");
        n2 = sc.nextInt();
        int m[] = new int[n2];
        System.out.println("Enter elements ");
        for(int i = 0; i < n2; i++)
        {
          m[i] = sc.nextInt();
        }
        
        int n3, k=0, j=0;
        n3 = n1 + n2;
        int p[] = new int[n3];
        //merging
        for(int i = 0; i < n3; i++)
        {
          if(i%2==0)
          {
              p[i] = l[k];
              k = k+1;
          }
          else
          {
              p[i] = m[j];
              j = j+1;
          }
        }
        
        int x = 0;
        for(int i = 0; i < n3; i++)
        {
          x = p[i];
          System.out.println(x);
          
        }
        
    }
    
  
    
    
    // calling the functions
    
    public static void main()
    {
        // initalisation
        P2 ob = new P2();
        
        ob.tribonacci();
        ob.ReverseInSameArray();
        ob.SecondHighest();
        ob.Merge();
        
    }
}