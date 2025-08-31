//Not Done
import java.util.Scanner;
public class MedianOfTwoSortedArray 
{
     
    static float sort(int a[],int b[])
    {
        int i=0,j=0,k=0,n=a.length,m=b.length;
        int s[]=new int[n+m];
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                s[k]=a[i];
                i++;
                k++;
            }
            else
            {
                s[k]=a[j];
                j++;k++;
            }
        }
        while(i<n)
        {
            s[k]=a[i];
                i++;
                k++;
        }
        while(j<m)
        {
            s[k]=b[j];
            j++;k++;
        }
        if(s.length%2==0)
        {
            int mid=s.length/2;
            return (float)(s[mid]+a[mid-1])/2;
        }
        else
        {
            return s[s.length/2];
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,6};
        int b[]={5,7,8,9,10,12,13};
        System.out.print("Median="+sort(a,b));
    }
    
}
