
import java.util.Scanner;
public class HCF 
{
    public static int GCD(int a,int b)
    {
        if(a==0 || b==0)
        {
            if(a==0)
            {
                return b;
            }
            else 
                return a;
        }
        else if(a>b)
        {
            a=a%b;
            return GCD(a,b);
        }
        else
        {
            b=b%a;
            return GCD(a,b);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fist no:");
        int a=sc.nextInt();
        System.out.print("Enter second no:");
        int b=sc.nextInt();
        System.out.print("GCD="+GCD(a,b));
    }
}
