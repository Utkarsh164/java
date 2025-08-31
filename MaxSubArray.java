public class MaxSubArray 
{
    static int max(int a[])
    {
        int sum=a[0],m=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(sum>=0)
            {
                sum=sum+a[i];
            }
            else
            {
                sum=a[i];
            }
            m=Math.max(m,sum);
        }
        return m;
    }
    public static void main(String args[])
    {
        int a[]={5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,7,2};
        System.out.print("Maximum sum="+max(a));
    }
    
}
