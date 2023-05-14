import java.util.*;
public class InsertionSort {
    public static void sorting(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
           int j=i;
           while(j>0&&arr[j]<arr[j-1])
           {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
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
