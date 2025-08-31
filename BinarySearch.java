import java.util.*;
public class BinarySearch 
{
    static int search(int a[],int l,int m,int h,int s)
    {
        if(l<=h)
        {
            if(a[m]==s)
            {
                return m;
            }
            else if(m<s)
            {
                l=m+1;
                return search(a,l,(l+h)/2,h,s);
            }
            else
            {
                h=m-1;
                return search(a,l,(l+h)/2,h,s);
            }
        }
        else 
        {
            return -1;
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        int s=sc.nextInt();
        System.out.print(search(a,0,(0+a.length-1)/2,a.length-1,s));
    }
    
}
