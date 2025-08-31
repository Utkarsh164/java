public class smallestsubarray 
{
    static int b(int[] a,int s)
    {
        int c=0,l=0,len=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            c=c+a[i];
            while(c>=s)
            {
                len=Math.min(len,i-l+1);
                c=c-a[l];
                l++;
            }
        }
        if(len==Integer.MAX_VALUE)
        {
            return 0;
        }
        return len;
    }
     public static void main(String args[])
    {
        int a[]={2,1,5,2,3,2};
        System.out.println( b(a,7) );

        int c[]={2,1,5,2,8};
        System.out.println(b(c,7));


        int d[]={3,4,1,1,6};
        System.out.println(b(d,8));
    }
    
}
