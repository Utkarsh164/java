import java.util.Scanner;
public class MoveAllZero 
{
    static void maz(int a[],int z,int n)
    {
        if(a.length==1)
        {
            return;
        }
        while(n<a.length)
        {
             if(a[n]!=0 && z!=n)
            {
                a[z]=a[n];
                a[n]=0;
            }
            
            if(a[z]!=0)
            {
                z++;
            }
           
            n++;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void main(String args[])
    
    {
        int a[]={1,0,12,3,0,0,5},z=0,n=0;
        maz(a,z,n);
    }
}
