public class FindTheDuplicateNumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i = 0;
            while(i < nums.length) {
                int correct = nums[i]-1;
                if(nums[correct] != nums[i]){
                    swap(nums, i, correct);
                }
                else
                    i++;
            }
            for(int index=0; index<nums.length; index++) {
                if(nums[index] != index+1)
                    return nums[index];
            }
            return nums.length;
        }
        void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
