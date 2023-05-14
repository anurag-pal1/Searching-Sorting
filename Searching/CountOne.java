import java.util.*;

public class CountOne {
    public static int countOne(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter size of array: ");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter array elements: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result=countOne(arr);
            System.out.println("Number of 1 in given array is: "+result);

        }
    }
}
