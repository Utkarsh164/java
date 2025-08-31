import java.util.*;
public class SumOfAllEementsOfArray 
{
    static int sum(int a[],int n)
    {
        if(n<0)
        {
            return 0;
        }
        return a[n]+sum(a,n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("size=");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]:",i);
            a[i]=sc.nextInt();
        }
        System.out.print("Sum="+sum(a,n-1));
    }
}
