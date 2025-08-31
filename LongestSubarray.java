import java.util.ArrayList;

public class LongestSubarray 
{
    static int lambai(String s)
    {
        ArrayList<Character> a=new ArrayList<>();
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            if(a.contains(s.charAt(i)))
            {
                a.subList(0, (s.charAt(i)-'a')+1).clear();
            }
            a.add(s.charAt(i));
            m=Math.max(m, a.size());
        }
        return m;
    }
    public static void main(String args[])
    {
        String s="abcabcbb";
        System.out.println(lambai(s));
    }
    
}
