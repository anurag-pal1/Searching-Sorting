import java.util.*;
public class Factorial {
    public static int findFactorial(int num)
    {
        if(num==0||num==1)
        {
            return 1;
        }
        return num*findFactorial(num-1);
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            int result=findFactorial(n);
            System.out.println("Factorial of given number is: "+result);
        }
    }
}
