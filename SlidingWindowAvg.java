    public class SlidingWindowAvg 
{

    static float[] avg(int[] a,int k)
    {
        if(a.length<k)
        {
            float b[]={0};
            return b;
        }

        float b[]=new float[a.length-k+1];
        int i=0;
        float s=0;

        for(int j=0;j<k;j++)
        {
            s=s+a[j];
        }


        b[i]=s/k;
        i++;

        
        for(int j=k;j<a.length;j++)
        {
            s=s+a[j]-a[j-k];
            b[i]=s/k;
            i++;
        }
        return b;


   }
    public static void main(String args[])
    {
        int a[]={1,3,2,6,-1,4,1,8,2};
        int k=5;
        float b[]=avg(a,65);
        for(int i=0;i<k;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}
