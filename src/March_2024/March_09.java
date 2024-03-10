package March_2024;

// This is a two pointer approach
// Time Complexity: O(N)
// Space Complexity: O(1)

public class March_09 {

    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {

            if(nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0])
                return -1;

            int first = 0;
            int second = 0;

            while(first < nums1.length && second < nums2.length) {
                if(nums1[first] == nums2[second]) {
                    return nums1[first];
                }
                else if(nums1[first] < nums2[second]) {
                    first++;
                }
                else {
                    second++;
                }
            }

            return -1;
        }
    }
}
