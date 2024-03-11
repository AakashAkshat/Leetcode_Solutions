public class TwoSum {

    // using Brute force approach
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for(int i =1;i<n;i++){
                for(int j =i;j<n;j++){
                    if(nums[j]+nums[j-i] == target) return new int [] {j-i,j};
                }
            }
            return null;
        }
    }

    // using HashMap
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap();

            for(int i=0; i<nums.length; i++){
                map.put(nums[i], i);
            }
            for(int i=0; i<nums.length; i++){
                int num = nums[i];
                int rem = target-num;
                if(map.containsKey(rem)){
                    int index = map.get(rem);
                    if(index == i)
                        continue;
                    return new int[]{i,  index};
                }
            }
            return new int[]{};

        }
    }
}
