
import java.util.*; 
public class searching2 {
    public static int LinearSearch(int arr[],int t)
    {
        boolean flag=false;
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t)
            {
                flag=true;
                temp=i;
                break;
            }
        }
        if(flag==true)
        {
            return temp;
        }
        else
        {
            return -1;
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
            int result=LinearSearch(arr,x);
            if(result!=-1)
            {
                System.out.println("Target element is found at index number: "+result);
            }
            else
            {
                System.out.println(result);
            }
        }
    }
}
