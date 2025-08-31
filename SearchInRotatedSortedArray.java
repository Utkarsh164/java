import java.util.Scanner;
public class SearchInRotatedSortedArray 
{
    static int bs(int a[],int s)
    {
        int l=0,h=a.length-1;

        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                return m;
            }
            else if(a[l]<=a[m] )
            {
                if(s>=a[l] && s<a[m])
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else 
            {
               if(s<=a[h] && a[m]<s)
               {
                l=m+1;
               }
               else
               {
                h=m-1;
               }
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int a[]={3,1};
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        int s=sc.nextInt();
        System.out.print(bs(a,s));
        
    }
}
