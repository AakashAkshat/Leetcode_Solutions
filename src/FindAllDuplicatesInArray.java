public class FindAllDuplicatesInArray {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int correct = nums[i]-1;
                if(nums[correct] != nums[i]){
                    swap(nums, i, correct);
                }
                else
                    i++;
            }
            List<Integer> ans = new ArrayList<>();
            for(int index=0; index<nums.length; index++){
                if(nums[index] != index+1)
                    ans.add(nums[index]);
            }
            return ans;
        }
        void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
