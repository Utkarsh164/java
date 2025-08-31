import java.util.*;
public class DuplicateInAnArray 
{
    public static void main(String args[])
    {
        int a[]={1,4,1,2,2,3};
        ArrayList<Integer> b=new ArrayList<>();
        int l=0;
        int c=0;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            c=(c^a[i]);
            if(c>k)
            {
                b.add(a[i]);
            }
            k=c;
        }
        for(int i=0;i<b.size();i++)
        {
            System.out.println(b.get(i));
        }
    }    
}
