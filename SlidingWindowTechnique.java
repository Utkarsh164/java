import java.util.Scanner;
public class SlidingWindowTechnique 
{
    static int sum(int a[],int k)
    {
        int s=0,m=-99999;
        for(int i=0;i<a.length-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                s=s+a[j];
            }
            m=Math.max(s,m);
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a[]={2,9,31,-4,21,7};
        System.out.print("length of sub array=");
        int k=sc.nextInt();
        System.out.print(sum(a,k));
    }
}
