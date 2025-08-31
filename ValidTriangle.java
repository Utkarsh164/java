//not mine
import java.util.Scanner;
public class ValidTriangle 
{
    static void t(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]>a[k] || a[j]+a[k]>a[i] || a[k]+a[i]>a[k])
                    {
                        System.out.println(a[i]+","+a[j]+","+a[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        int a[]={5,15,24,57,39,2,3,33};
        t(a);
    }
}
