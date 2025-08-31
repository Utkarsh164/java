import java.util.Scanner;
public class WoodCutting
{
    
    static int wc(int a[],int Len,int b)
    {
          int l=0,h=Len;
          while(l<=h)
          {
            int m=(l+h)/2;
            int s=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>m)
                {
                    s=s+a[i]-m;
                }
            }
            if(s==b|| l==m)
            {
                return m;
            }
            else if(s>b)
            {
                l=m;
            }
            else
            {
                h=m;
            }
          }
          return 0;
    }
    public static void main(String args[])
    {
        int a[]={20,15,17,10};
        Scanner sc=new Scanner(System.in);
        System.out.print("Unit needed=");
        int b=sc.nextInt();
        int m=a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println("Heigth at which mashine should be kept="+wc(a,m,b));
    }
}
