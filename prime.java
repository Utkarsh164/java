import java.util.Scanner;
public class prime
{
    public static int prime(int a)
    {
        if(a==1)
        {
            return -1;
        }
        else if(a==2 || a==3)
        {
            return 1;
        }
        else if(a%2==0 || a%3==0)
        {
            return 0;
        }
        for(int i=5;i*i<a;i=i+6)
        {
            if(a%i==0 || a%(i+2)==0)
            {
                return 0;
            }
        } 
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter:");
        int a=sc.nextInt();
        int q=prime(a);
        if(q<0)
        {
            System.out.print("Neither prime nor composite");
        }
        else if(q==0)
        {
            System.out.print("Not an prime no");
        }
        else 
            System.out.print("prime no");
    }
}
