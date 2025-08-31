import java.util.*;
public class CeilFloor
{
    static int f(int a[],int s)
    {
        int l=0,h=a.length-1;
        if(s<a[0])
        {
            return -1;
        }
        
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                return a[m];
            }
            else if(a[m]<s)
            {
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return a[h];
    }
    static int c(int a[],int s)
    {
        if(s>a[a.length-1])
        {
            return -1;
        }
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                return a[m];
            }
            else if(a[m]<s)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
        return a[l];
    }
    public static void main(String args[])
    {
        int a[]={11,21,31,41,51,61,71};
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        int s=sc.nextInt();
        System.out.println("Floor="+f(a,s));
        System.out.println("ceil="+c(a,s));
    }
}
