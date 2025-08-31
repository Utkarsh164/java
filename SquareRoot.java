import java.util.Scanner;
public class SquareRoot 
{
    static int s(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
       int l=2,h=n/2,m;
       while(l<=h)
       {
        m=(l+h)/2;
        if(m*m==n)
        {
            return m;
        }
        else if(n<m*m)
        {
            h=m-1;
        }
        else
        {
            l=m+1;
        }
       }
       return l-1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number=");
        int n=sc.nextInt();
        System.out.print("Sqrt="+s(n));
    }
}
