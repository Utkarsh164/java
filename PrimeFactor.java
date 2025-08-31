//check this
import java.util.Scanner;
public class PrimeFactor 
{
    public static void p(int n)
    {
        int i=2;
        while(n>=i*i)
        {while(n%i==0)
        {
            System.out.println(i);
            n=n/i;
        }
        i++;}
        if(n!=1)
        {
            System.out.print(n);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        p(n);
    }
}
