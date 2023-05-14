import java.util.*;
public class BubbleSort {
    public static void sorting(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       System.out.println("Sorted array is: ");
       System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            System.out.println("Enter array elements: ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            sorting(arr);
        }
    }
}
