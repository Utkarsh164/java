import java.util.Scanner;
public class FactorialR 
{
    static int fac(int n)
    {
        if(n==1|| n==2)
        {
            return 1;
        }
        else
        {
            return fac(n-1)+fac(n-2);
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print(fac(n));
    }
}
