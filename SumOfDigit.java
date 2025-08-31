
import  java.util.*;
public class SumOfDigit
{
    static int count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10+count(n/10);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print("sum of Digits="+count(n));
    }
    
}
