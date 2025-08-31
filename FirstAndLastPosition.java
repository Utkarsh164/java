import java.util.Scanner;
public class FirstAndLastPosition
{
    
    public static void main(String args[])
    {
        int a[]={3,4,4,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.print("Element=");
        int s=sc.nextInt();     
        int b[]={-1,-1};
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                b[0]=m;
                h=m-1;
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
        l=0;h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                b[1]=m;
                l=m+1;
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
        System.out.print(b[0]+","+b[1]);
    }
}
