import java.util.Scanner;
public class BitonicSearch 
{
    static int BatonicIndex(int a[])
    {
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]>a[m-1]&&a[m]>a[m+1])
            {
                return m;
            }
            else if(a[m]<a[m+1])
            {
                l=m+1;
            }
            else if(a[m]<a[m-1])
            {
                h=m-1;
            }
        }
       
        return -1;
        
        
    }
    static int bs(int a[],int h,int l,int s)
    {
        if(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                return m;
            }
            else if(a[m]>s)
            {
                return bs(a,h=m-1,l,s);
            }
            else
            {
                return bs(a,h,l=m+1,s);
            }

        }
        return -1;
    }
    static int bc(int a[],int b,int s)
    {
        int l=b,h=a.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==s)
            {
                return m;
            }
            else if(a[m]>s)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
                
            }

        }
        return -1;
    }

    public static void main(String args[])
    {
        int a[]={5,6,7,8,9,10,3,2,1};
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        int s=sc.nextInt();
        int b=BatonicIndex(a);
        int as=bs(a,b,0,s);
        int ds=bc(a,b+1,s);
        if(as>=ds)
        {
            System.out.print(as);
        }
        else
        {
            System.out.print(ds);
        }
    }
}
