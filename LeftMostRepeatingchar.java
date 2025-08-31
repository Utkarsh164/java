import java.util.*;
public class LeftMostRepeatingchar 
{
    static int as(String s)
    {
        HashMap<Character,Integer> h=new HashMap<>();

        
        for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),0);
            }
            h.put(s.charAt(i),h.get(s.charAt(i))+1);
        }


        for(int i=0;i<s.length();i++)
        {
            if(h.get(s.charAt(i))>1)
            {
                return i;
            }
        }
        return -1;
    }

    
    public static void main(String args[])
    {
        String s="azxbba";
        System.out.println(as(s));
       
    }
    
}
