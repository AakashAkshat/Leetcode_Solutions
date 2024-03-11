import java.util.HashSet;

// Using a Set data structure
// Time Complexity: O(N)
// Space Complexity: O(|arr1| + |arr2|)

public class IntersectionOfTwoArrays {

    class Solution {
        public int[] intersection(int[] arr1, int[] arr2) {
            // store elements of arr1 in set1
            HashSet<Integer> set1 = new HashSet<Integer>();
            for(int i=0; i<arr1.length; i++) {
                set1.add(arr1[i]);
            }
            // store common elements of arr1 and arr2 in set2
            HashSet<Integer> set2 = new HashSet<Integer>();
            for(int i=0; i<arr2.length; i++) {
                if(set1.contains(arr2[i]))
                    set2.add(arr2[i]);
            }
            // store set2 elements in arr
            int[] arr = new int[set2.size()];
            int i=0;
            for(int num : set2) {
                arr[i++] = num;
            }
            return arr;
        }
    }
}
