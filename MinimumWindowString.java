import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowString 
{
    
        
        static String minWindow(String s, String t)
        {
           if(s.length()<t.length())
           {
            String r="";
           return r;
        }
            
            HashMap<Character,Integer> h=new HashMap<>();
            for(int i=0;i<t.length();i++)
            {
                if(!h.containsKey(t.charAt(i)))
                {
                    h.put(t.charAt(i),0);
                    
                }
                h.put(t.charAt(i),h.get(t.charAt(i))+1);
            }
            
           
            for(int i=0;i<s.length();i++)
            {
                if
            }
           
        }
    
    
    
    public static void main(String args[])
    {
       System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
    
}
