import java.util.*;
public class CotainDuplicate 
{
    static Boolean cd(int a[])
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(h.contains(a[i])==true)
            {
                return true;
            }
            else
            h.add(a[i]);
        }
        return false;
    }
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.print("n=");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
        System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
       }
       System.out.print(cd(a));
    }
    
}
        