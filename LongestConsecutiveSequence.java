import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LongestConsecutiveSequence
{
   
        static int longestConsecutive(int[] nums) 
        {
            
                if(nums.length==0)
                {
                    return 0;
                }
                HashSet<Integer> h=new HashSet<>();
                for(int i:nums)
                {
                    h.add(i);
                }
                
                int f=1;
                int l=0;
                
                for(int i=0;i<nums.length;i++)
                {
                    if(h.contains(nums[i]-1)==false)
                    {
                        int n=nums[i];
                        while(h.contains(n+1))
                        {
                            f++;
                            n++;
                        }
                    }
                    l=Math.max(l,f);
                    f=1;
                    if(l>nums.length/2)
                    {
                        break;
                    }
                }
                
                return l;
                
            
        }
            
        }


    public static void main(String args[])
    {
        int nums[]={100,200,1,2,3,4};
        System.out.print(longestConsecutive(nums));
    }
}
