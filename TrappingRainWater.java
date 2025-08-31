import java.util.Scanner;
public class TrappingRainWater 
{
    static int WC(int a[])
    {
        int l=1,r=a.length-2,L=a[0],R=a[a.length-1],res=0;
        while(l<=r)
        {
            if(L<=R)
            {
                if(L<=a[l])
                {
                    L=a[l];
                }
                else
                {
                    res=res-a[l]+L;
                }
                l++;
            }
            else
            {
                if(R<=a[r])
                {
                    R=a[r];
                }
                else
                {
                    res=res-a[r]+R;
                }
                r--;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int a[]={1,0,2,1,0,1,3,2,1,2,1};
        System.out.print("Total Water Count="+WC(a));
        
    }
}
