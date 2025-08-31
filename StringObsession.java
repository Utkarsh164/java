import java.util.*;

public class StringObsession {
    
    private static Map<String, Integer> dp = new HashMap<>();  
    
    private static int mxrem(String s, List<String> substrings) {
        if (dp.containsKey(s)) 
        {
            return dp.get(s);
        }
        int cnt = 0;
        for (String sub : substrings) 
        {
            int pos =s.indexOf(sub);
            if (pos != -1) 
            {
                String newString =s.substring(0, pos)+s.substring(pos + sub.length());
                cnt = Math.max(cnt, 1 + mxrem(newString, substrings));
            }
        }
        dp.put(s, cnt);
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 
        List<String> substrings = new ArrayList<>();
        for (int i=0;i<N;i++) 
        {
            substrings.add(sc.next());
        }
        String ms = sc.next();
        System.out.print(mxrem(ms,substrings));
        sc.close();
    }
}
