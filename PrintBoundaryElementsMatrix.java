public class PrintBoundaryElementsMatrix
{
    static void z(int a[][])
    {
        for(int i=0;i<a[0].length;i++)
        {
            System.out.print(a[0][i]+" ");
        }
        System.out.println();


        for(int i=0;i<a.length;i++)
        {
            int j=a[0].length-1;
            System.out.print(a[i][j]+" ");
        }
        System.out.println();


        for(int i=a[0].length-1;i>=0;i--)
        {
            int j=a[0].length-1;
            System.out.print(a[j][i]+" ");
        }
        System.out.println();

        
        for(int i=a.length;i>=0;i--)
        {
            System.out.print(a[i][0]+" ");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        int a[][]={{1,2,3},
                   {4,5,6}, 
                   {7,8,9},
                   {10,11,12}
                   };
        z(a);
    }
}
