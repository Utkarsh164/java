import java.util.Scanner;
public class LCM 
{
    public static int lcm(int a,int b,int c)
    {
        if(a==0 || b==0)
        {
            if(a==0)
            {
                return c/b;
            }
            else
            {
                return c/a;
            }
        }
        else if(a>b)
        {
            a=a%b;
            return lcm(a,b,c);
        }
        else 
        {
            b=b%a;
            return lcm(a,b,c);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First no:");
        int a=sc.nextInt();
        System.out.print("Enter second no:");
        int b=sc.nextInt();
        int c=a*b;
        System.out.print("LCM="+lcm(a,b,c));
    }
    
}
