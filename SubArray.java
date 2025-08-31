public class SubArray 
{
    static void sa(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=i;j<n.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(n[k]+" ");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String args[])
    {
        int n[]={1,2,3,4,5};
        sa(n);
    }
    
}
