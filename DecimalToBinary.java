import java.util.Scanner;
public class DecimalToBinary
{
    static void convert(int n)
    {
        int r=0,m=1;
        while(n>0)
        {
           r=r+(n%2)*m;
           m=m*10;
           n=n/2;
        }
        System.out.print(r);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int a=sc.nextInt();
        convert(a);
    }
}
