import java.util.*;
public class SubsetSum 
{
    static int sum(int a[],int i,int s)
    {
        if(s==0)
        {
            return 1;
        }
        if(i==a.length||s<0 )
        {
            return 0;
        }
        return sum(a,i+1,s-a[i]) + sum(a,i+1,s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("sum=");
        int s=sc.nextInt();
        System.out.print("no of elements=");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]:",i);
            a[i]=sc.nextInt();
        }
        System.out.print(sum(a,0,s));
    }
    
}
