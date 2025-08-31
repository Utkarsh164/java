import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class permutationnumber 
{
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        function(ans, nums, 0);
        return ans;
    }

    static void function(List<List<Integer>> ans, int[] arr, int start) {
        if (start == arr.length) {
            List<Integer> list = new ArrayList();
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i]+",");
                list.add(arr[i]);
            }
            System.out.println();
            ans.add(list);
            
            return;
        }

        for (int i = start; i < arr.length; i++) {
            System.out.printf("i=%d,start=%d",i,start);
            System.out.println(" ");
            swap(arr, start, i);
            function(ans, arr, start + 1);
            swap(arr, start, i);
        }
        System.out.println("loop over");
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main (String args[])
    {
        int[] a={0,1,2};
        permute(a);
    }
}
