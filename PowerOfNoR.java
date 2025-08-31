import java.util.Scanner;
public class PowerOfNoR 
{
    static long pow(int n,int i)
    {
        if(i==0)
        {
            return 1;
        }
        if(i%2!=0)
        {return n*pow(n,i-1);}
        else
        {
            long r=pow(n,i/2);
            return r*r;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Base:");
        int n=sc.nextInt();
        System.out.print("Exponent:");
        int i=sc.nextInt();
        System.out.print(pow(n,i));
    }
}
