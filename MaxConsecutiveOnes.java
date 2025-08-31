public class MaxConsecutiveOnes 
{
    static int count(int a[])
    {
        int c=0,m=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==1)
           {
            c=c+1;
           }
           else if(a[i]==0)
           {
            c=0;
           }
           m=Math.max(c,m);
        }
        return m;
    }
    public static void main(String args[])
    {
        int a[]={1,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.print("Longest Consecutive Ones="+count(a));
    }
}
