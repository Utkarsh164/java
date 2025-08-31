public class TOH 
{
    static void toh(int n,char a,char b,char c)
    {
        if(n>0)
        {
            toh(n-1,a,c,b);
            System.out.println(a+"->"+c);
            toh(n-1,b,a,c);
        }
    }
    public static void main(String args[])
    {
        toh(3,'A','B','C');
    }
}
