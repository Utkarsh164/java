public class MinDistanceBWWords 
{
    static int distance(String[] s,String p,String t)
    {
        int P=-1,T=-1,m=s.length+1;
        for(int i=0;i<s.length;i++)
        {
            int z=1;
            if(s[i]==p)
            {
                P=i;
            }
            if(s[i]==t)
            {
                T=i;
            }
            if(P!=-1 && T!=-1)
            {
                if(T-P<0)
                {
                    z=-1;
                }
                m=Math.min(m,z*(T-P));
                
            }
            
        }
        if(m==s.length+1)
            {
                return -1;
            }
            return m;
    }
    public static void main(String args[])
    {
        String s[]={"a","c","d","b","a"};
        String p="a";
        String t="b";
        System.out.println(distance(s,p,t));
    }
    
}
