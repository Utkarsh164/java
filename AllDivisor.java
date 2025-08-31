import java.util.Scanner;
public class AllDivisor
{
    static void div(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                if(i!=n/i)
                {System.out.println(n/i);}
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
        div(n);sc.close();
    }
    
}
