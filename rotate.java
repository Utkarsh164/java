import java.util.Scanner;
public class rotate 
{
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        int a[]=new int[10];
        System.out.print("size of array:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]:",i+1);
            int s=sc.nextInt();
            a[i]=s;
        }
        System.out.print("How many elements to be rotated:");
        int g=sc.nextInt();
        int t[]=new int[g];
        for(int i=0;i<g;i++)
        {
            t[i]=a[i];
        }
        for(int i=0;i<n-g;i++)
        {
            a[i]=a[i+g];
        }
        int ko=0;
        for(int i=n-g;i<n;i++)
        {
            a[i]=t[ko];
            ko++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }




    }
    
}
