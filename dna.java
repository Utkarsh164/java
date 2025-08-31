import java.util.*;
public class dna 
{
    static ArrayList<ArrayList<String>> d(String s,int n)
    {
        if(s.length()==n)
        {ArrayList<String> b=new ArrayList<>();
            ArrayList<ArrayList<String>> a=new ArrayList<>();
            b.add(s);
            a.add(b);   
            return a;
        }
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        ArrayList<String> a=new ArrayList<>();
        int b[]=new int[26];
        String st="";
        for(int i=0;i<n;i++)
        {
            b[s.charAt(i)-'A']++;
            st=st+s.charAt(i);
        }
        String c="";
        for(int i=0;i<26;i++)
        {
            c=c+"#"+b[s.charAt(i)-'A'];
        }
        a.add(st);
        h.put(c, a);

        for(int i=n;i<s.length();i++)
        {
            b[s.charAt(i)-'A']++;
            b[s.charAt(i-n)-'A']--;
            st=st.substring(1)+s.charAt(i);
            

            
            c="";
            for(int j=0;j<26;j++)
            {
                c=c+"#"+b[s.charAt(j)-'A'];
            }


            if(!h.containsKey(c))
            {
                h.put(c,new ArrayList<String>());
            }
            ArrayList<String> f=h.get(c);
            if(!f.contains(st))
            {
                h.get(c).add(st);
            }

            
        }


        ArrayList<ArrayList<String>> jk=new ArrayList<>();
        for(Map.Entry<String,ArrayList<String>> i:h.entrySet())
        {
            if(i.getValue().size()>1)
            {
            
                    jk.add(i.getValue());
                
            }
        }
        if(jk.size()==0)
        {for(Map.Entry<String,ArrayList<String>> i:h.entrySet())
            {jk.add(i.getValue());}}
       return jk;
    }
    public static void main(String args[])
    {
       // AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT
       //["AAAAACCCCC","CCCCCAAAAA"]
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        ArrayList<ArrayList<String>> a=d(s,10);

       // System.out.println(a.get(0));
        //System.out.println(a.get(1));
        for(int i=0;i<a.size();i++){System.out.println(a.get(i)); }
        
    }
    
}
