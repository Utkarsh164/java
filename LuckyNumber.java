//position ka khel hai
import java.util.*;
public class LuckyNumber 
{
    static boolean isit(int n,int i)
    {
        if(i>n)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        return isit(n-n/i,i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print(isit(n,2));
    }
}
