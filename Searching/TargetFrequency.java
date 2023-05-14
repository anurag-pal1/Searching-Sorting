import java.util.*;
public class TargetFrequency {
    public static void targetFrequency(int arr[],int t)
    {
        boolean flag=false;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t)
            {
                flag=true;
                count++;
            }
        }
        if(flag==true)
        {
            System.out.println("Target element is found with frequency: "+count);
        }
        else
        {
            System.out.println("Element is not found.");
        }

    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter size of an array: ");
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter target element: ");
            int x=sc.nextInt();
            targetFrequency(arr,x);
        }
    }
}
