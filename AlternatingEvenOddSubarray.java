public class AlternatingEvenOddSubarray 
{
    static int count(int a[])
    {
        int c=1,m=1;
        if(a.length==1 )
        {
            return 1;
        }
        for(int i=1;i<a.length;i++)
        {
            if((a[i]%2==0) && a[i-1]%2!=0)
            {
                c=c+1;
            }
            else if(a[i]%2!=0 && a[i-1]%2==0)
            {
                c=c+1;
            }
            else
            {
                c=1;
            }
            m=Math.max(m,c);
        }
        return m;
    }
    public static void main(String args[])
    {
        int a[]={2,3,10,5,6};
        System.out.print("max="+count(a));
    }
}
