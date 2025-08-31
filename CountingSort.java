public class CountingSort
{
    public static void main(String args[])
    {
        int k=9,n=17;
        int c[]=new int[k];
        int b[]=new int[n];
        int a[]={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        for(int i=0;i<n;i++)
        {
            c[a[i]]=c[a[i]]+1;
        }
        for(int i=1;i<=k;i++)
        {
            c[i]=c[i]+c[i-1];
        }
        for(int i=n;i>=1;i--)
        {
            c[i]=c[i]-1;
            b[c[i]]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+",");
        }
    }
    
}
