public class LongestRepeatingCharacterReplacement 
{
    
        static  int characterReplacement(String s, int k) 
        {
           int a[]=new int[26];
           int l=0,m=0,c=0;
           for(int r=0;r<s.length();r++)
           {
            a[s.charAt(r)-'A']++;
            m=Math.max(m,a[s.charAt(r)-'A']);
            if(r-l-m+1>k)
            {
                l++;
            }
            c=Math.max(c,r-l+1);
           }
           return c;
        }
    public static void main(String args[])
    {
       String s = "ABAB";
       int k = 2;
       System.out.print(characterReplacement(s,k));
    }
    
}
