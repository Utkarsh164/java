
import java.util.*;

public class a {

    public static int maxDistinctSplit(ArrayList<Integer> arr) {
        int n = arr.size();

        int[] prefix = new int[n - 1];
        int[] suffix = new int[n - 1];

        HashSet<Integer> set = new HashSet<>();

        // prefix distinct count
        for (int i = 0; i < n - 1; i++) {
            set.add(arr.get(i));
            prefix[i] = set.size();
        }

        set.clear();

        // suffix distinct count
        for (int i = n - 1; i > 0; i--) {
            set.add(arr.get(i));
            suffix[i - 1] = set.size();
        }

        int max = 0;

        // check all split positions
        System.out.println(arr);
        for (int i = 0; i < n-1; i++) {
            System.out.println("prefix : "+ prefix[i]+" suffix : "+ suffix[i]);
            int sum = prefix[i] + suffix[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));
        System.out.println(maxDistinctSplit(arr)); // Output: 5
    }
}
