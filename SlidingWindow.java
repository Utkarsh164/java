import java.util.Scanner;
public class SlidingWindow
{
    static int sum(int a[],int k)
    {
        int s=0,i,m=Integer.MAX_VALUE;
        for(i=0;i<k;i++)
        {
            s=s+a[i];
        }
        m=s;
        for( ;i<a.length;i++)
        {
            s=s-a[i-k]+a[i];
            m=Math.max(m,s);
        }
        return m;
    } 
    public static void main(String args[])
    {
        int a[]={-2,-9,-31,-4,-21,-7};
        Scanner sc=new Scanner(System.in);
        System.out.print("k=");
        int k=sc.nextInt();
        System.out.print("Max sum sub array="+sum(a,k));
    }
}