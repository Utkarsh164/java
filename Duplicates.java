import java.util.*;
public class Duplicates 
{
    static int ndup(int a[])
    {
       int j=0;
       for(int i=0;i<a.length;i++)
       {
        if(a[j]!=a[i])
        {
            j=j+1;
            a[j]=a[i];
        }
       }
       return j;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,4,4,4,4,5,5,5,5,5,6};
        int j=ndup(a);
        for(int i=0;i<=j;i++)
        {
            System.out.print(a[i]+",");
        }
     
    }
}
