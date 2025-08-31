//Element shoud be greater than all elment on right
public class LeaderInAnArray 
{
    static void leader(int a[])
    {
        int m=a[a.length-1];
        System.out.print(m+" ");
        int i=a.length-2;
        while(i>=0)
        {
           if(a[i]>m)
           {
            m=a[i];
            System.out.print(m+" ");
           }
           i--;
        }
        
    }
    public static void main(String args[])
    {
        int a[]={8,11,5,15,7,6,3};
        leader(a);
    }
}
