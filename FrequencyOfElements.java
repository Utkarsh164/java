//pre-condition is it should be sorted
import java.util.*;
public class FrequencyOfElements 
{
    static void count(int a[])
    {
        int i=0,j=0;
        while(i<a.length)
        {
            if(a[i]!=a[j])
            {
                System.out.println("frequency of"+a[j]+" is "+(i-j));
                j=i;
            }
            if(i==a.length-1)
            {
                System.out.println("frequency of"+a[j]+" is "+(i+1-j));
            }
            i++;
        }
    }
    public static void main(String args[])
    {
        int a[]={20};
        count(a);
    } 
    
}
