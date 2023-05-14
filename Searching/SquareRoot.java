import java.util.*;

public class SquareRoot {

    public static boolean findSquareRoot(int num)
    {
        
           int low=0;
           int high=num/2;
           while(low<=high)
           {
             int mid=low+(high-low)/2;
             long var=mid*mid;
                 if(var==num)
                 {
                    return true;
                 }
                 else if(var<num)
                {
                    low=mid+1;
                 }
                 else 
                 {
                    high=mid-1;
                 }
           }
        return false;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            boolean result=findSquareRoot(n);
            System.out.println("Square Root of number: "+result);
        }
    }
}


