public class LargestPositiveIntegerThatExistsWithItsNegative {
    class Solution {
        public int findMaxK(int[] nums) {
            Set<Integer> negativeSet = new HashSet<Integer>();

            for(int num : nums) {
                if(num < 0) {
                    negativeSet.add(num);
                }
            }

            int maxNum = -1;

            for(int num : nums) {
                if(num > 0 && num > maxNum && negativeSet.contains(-1*num)) {
                    maxNum = num;
                }
            }

            return maxNum;
        }
    }
}
