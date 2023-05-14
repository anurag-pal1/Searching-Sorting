import java.util.*;
public class searching1{
    public static void ElementSearch(int arr[],int n)
    {
        int temp=0;
        boolean flag=false;
        int m=arr.length;
        for(int i=0;i<m;i++)
        {
            if(arr[i]==n)
            {
                temp=i;
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Element found at index number: "+temp);
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
              System.out.println("Enter size of array: ");
              n=sc.nextInt();
              int arr[]=new int[n];
              System.out.println("Enter elements of array: ");
              for(int i=0;i<n;i++)
              {
                arr[i]=sc.nextInt();
              }
              System.out.println("Enter target element: ");
              int x=sc.nextInt();
              ElementSearch(arr,x);
        }
    }
}