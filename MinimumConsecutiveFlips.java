public class MinimumConsecutiveFlips 
{
    static void flip(int a[])
    {
        int s=0,l=0;
        while(l<a.length)
        {
            if(a[l]==0)
            {
                s=l;
                while(a[l+1]==0)
                {
                    l++;
                }
                System.out.println("s="+s+",  l="+l);
            }
            else if(a[s]==1)
            {
                l++;
                s=l;
            }

            
        }
    }
    public static void main(String args[])
    {
        int a[]={1,0,0,0,0,1,1,1,1,1,0,1,0,1};
        flip(a);
    }
    
}
