import java.util.*;
public class SelectionSort {
    public static void sorting(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            if(min_idx!=i)
            {
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter size of array: ");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter elements of array: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            sorting(arr);
            System.out.println("Sorted array is: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
