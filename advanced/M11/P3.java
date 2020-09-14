package advanced.M11;
import java.util.Scanner;
/**
2. Write a program to perform a Linear Search
3. Write a program to perform a Binary Search
4. Write a program to perform a Bubble Sort
5. Write a program to perform a Selection Sort
*/
public class P3
{
    Scanner sc = new Scanner(System.in);
    //linear search
    public void LinearSearch()
    {
        System.out.println("Enter 10 elements for the list to be searched");
        int l[] = new int[10];
        System.out.println("Enter element to be searched");
        int n = sc.nextInt();
        int k = 0;
        for( int i = 0;i < 10; i++)
        {
            if(n == l[i])
            {
                k = 1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("Found");
            
        }
        
        else
        {
            System.out.println("Not found");
        }
    }
    //binary search
    public void BinarySearch()
    {
        int k = 0, p = 0, n, l = 0, u = 9;
        int li[] = new int[10];
        System.out.println("Enter 10 elements for the list to be searched");
        for(int i = 0; i < 10; i ++)
        {
            li[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to be searched");
        n = sc.nextInt();
        
        
        while(l<=u)
        {
            p = (l + u)/ 2;
            if(li[p]<n)
            {
                l = p + 1;
            }
            
            if(li[p]>n)
            {
                u = p - 1;
            }
            
            if(li[p]==n)
            {
                k = 1;
                break;
            }
            
            
        }
        
        if(k==1)
        {
            System.out.println("Found");
            
        }
        
        else
        {
            System.out.println("Not found");
        }
    }
    //selection sort
    public void SelectionSort()
    {
        int t, min;
        int l[] = new int[10];
        
        System.out.println("Enter 10 elements for the list to be sorted");
        for(int i = 0; i < 10; i ++)
        {
            l[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 9; i++)
        {
            min = i;
            for(int j = i + 1; j < 10; j++)
            {
              if(l[j] < l[min])
              {
                min = j;
              }
              t = l[i];
              l[i] = l[min];
              l[min] = t;
            }
        }
        
        System.out.println("Ascending order:");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(l[i]);
        }
            
    }
    //bubble sort
    public void BubbleSort()
    {
        int t;
        int l[] = new int[10];
        
        System.out.println("Enter 10 elements for the list to be sorted");
        for(int i = 0; i < 10; i ++)
        {
            l[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 9; i ++)
        {
            for(int j=0;j<(9-i);j++)
            {
                if(l[j]>l[j+1])
                {
                    t=l[j];
                    l[j] = l[j+1];
                    l[j+1]=t;
                }
            }
        }
        
        System.out.println("Ascending order:");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(l[i]);
        }
        
        
    }
    
    //function calling
    public void main()
    {
        P3 ob = new P3();
        ob.LinearSearch();
        ob.BinarySearch();
        ob.BubbleSort();
        ob.SelectionSort();
    }
}
