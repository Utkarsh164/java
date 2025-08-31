public class PlusOne 
{
    static void plusOne(int[] digits)       

    {
        long n=0;
        for(int i=0;i<digits.length;i++)
        {
            n=n*10+digits[i];
            System.out.println(n);
        }
        System.out.println(n);
        long z=n+1;
        System.out.println(z);
        long k=z,c=0;
        while(k!=0)
        {
            c++;
            k=k/10;
        }
        long a[]=new long[c];
        for(long i=c-1;i>=0;i--)
        {
            a[i]=z%10;
            z=z/10;
        }
        for(long i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String args[])
    {
        int a[]={9,8,7,6,5,4,3,2,1,0};
        for(int i=0;i<a.length;i++)
        {System.out.print(a[i]);}
        System.out.println("");
        plusOne(a);
        
       
    }
    
}
