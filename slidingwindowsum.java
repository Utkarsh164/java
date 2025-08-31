public class slidingwindowsum 
{
    static int[] s(int[] a,int k)
    {
        int b[]=new int[k];
        if(k>a.length)
        {
            for(int i=0;i<k;i++)
            {
                b[i]=0;
                return b;
            }
        }

        int c=0;   
        for(int i=0;i<k;i++)
        {
            c=c+a[i];
        }
        int m=c;
        int j=k-1;
        for(int i=k;i<a.length;i++)
        {
            c=c+a[i]-a[i-k];
            if(c>m)
            {
                m=c;
                j=i;
            }
        }
        int n=k-1;
        for(int i=j;i>j-k;i--)
        {
            b[n]=a[i];
            n--;
        }
        return b;

    
    }
    public static void main(String args[])
    {
        int a[]={5,8,12,5,9,-1000,882};
        int k=3;
        int b[]=s(a,k);
        for(int i=0;i<k;i++)
        {
            System.out.print(b[i]+",");
        }
    }
    
}
