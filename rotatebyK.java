import java.util.Scanner;
public class rotatebyK
{
    static void rotate(int a[],int k)
    { 
        k=k%a.length;
        if(k<0)
        {
            k=a.length+k;
        }
        while(k>0)
        {
            int n=a[0];
            for(int i=1;i<a.length;i++)
            {
                a[i-1]=a[i];
            }
            a[a.length-1]=n;
            k--;
        }
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+",");
            }
        
    }  
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("k=");
        int k=sc.nextInt();
        rotate(a,k);
    }
}