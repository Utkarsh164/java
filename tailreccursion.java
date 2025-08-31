//no of 5=no of 0 
import java.util.Scanner;
public class tailreccursion
{
    public  static int tail(int n,int c,int i)
    {
       if(n>=i)
       {
        c=c+n/i;
        i=i*5;
        return tail(n,c,i);
       }
       else 
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("a=");
        int a=sc.nextInt();
        System.out.print("no of zeros="+tail(a,0,5));
        sc.close();
    }
}