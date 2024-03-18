public class FirstMissingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            for(int i=0; i<nums.length; i++) {
                int element = nums[i]; // taking the element from the array
                if(element >= 1 && element <= nums.length) {
                    int pos = element-1;    // check the correct position
                    if(element != nums[pos]){
                        int temp = element;
                        nums[i] = nums[pos];
                        nums[pos] = element;
                        i--;
                    }
                }
            }

            for(int i=0; i<nums.length; i++) {
                if(nums[i] != i+1) {
                    return i+1;
                }
            }

            return nums.length+1;
        }
    }
}
