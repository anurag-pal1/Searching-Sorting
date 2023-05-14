import java.util.*;
public class ArraySorting {
    public static void sorting(int arr[])
    {
        int m=arr.length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
