import java.util.*;
public class Fibonaaci {
    public static int findFibonacciTerm(int num)
    {
        if(num==0||num==1)
        {
            return num;
        }
        return findFibonacciTerm(num-1)+findFibonacciTerm(num-2);
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            int result=findFibonacciTerm(n);
            System.out.println("Fibonacci term is: "+result);
        }
    }
}
