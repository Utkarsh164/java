import java.util.*;
public class groupanagrams 
{

        static List<List<String>> groupAnagrams(String[] strs)
        {
            HashMap<String,List<String>> haa=new HashMap<>();
            for(int i=0;i<strs.length;i++)
            {
                String c=strs[i];
                int count[]=new int[26];
                
                
                for(int j=0;j<c.length();j++)
                {
                    count[c.charAt(j)-'a']++;
                }
                
                
                String s="";
                for(int j=0;j<26;j++)
                {
                    s=s+Integer.toString(count[j]);
                }
                
                if(haa.containsKey(s)!=true)
                {
                    haa.put(s,new ArrayList<>());
                }
                haa.get(s).add(c);
            }
            
        ArrayList<List<String>> a=new ArrayList<>();
        for(Map.Entry<String,List<String>> i : haa.entrySet())
        {
            a.add(i.getValue());
        }
        return a;
        }
    
    public static void main(String args[])
    {
        
       String c[]={"eat","tea","tan","ate","nat","bat"};
       System.out.print(groupAnagrams(c));



    }
    
}
