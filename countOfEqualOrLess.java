import java.util.Scanner;
public class countOfEqualOrLess 
{
    static int bs(int a[],int s)
    {
        int l=0,h=a.length-1,m=0;
        while(l<=h)
        {
            m=(l+h)/2;
            if(a[m]==s)
            {
                while(a[m]==a[m+1] && (m+1)!=a.length)
                {
                    m=m+1;
                }
                break;
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
        if(a[m]>s)
        {
            return m;
        }
        return m+1;
    }
    public static void main(String args[])
    {
        int a[]={2,6,12,18,21,26,26,26};
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print(bs(a,n));
    }
    
}
