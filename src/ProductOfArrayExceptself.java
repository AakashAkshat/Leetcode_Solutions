public class ProductOfArrayExceptself {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            //    int[] ans = new int[nums.length];

            int prod = 1;

            if (noOfZeroes(nums) > 1) {  // checking in the given array, zero is present or not
                for(int i=0; i<nums.length; i++) {
                    nums[i] = 0;
                }
            }
            else if(noOfZeroes(nums) == 1) {
                for(int i: nums) {
                    if(i != 0) {
                        prod = prod * i;    // find the product excepting zero
                    }
                }

                for(int i=0; i<nums.length; i++) {
                    if(nums[i] == 0)
                        nums[i] = prod;

                    else
                        nums[i] = 0;
                }
            }
            else {
                for(int i: nums) {
                    prod = prod * i;
                }

                for(int i=0; i<nums.length; i++) {
                    nums[i] = prod / nums[i];
                }
            }

            return nums;
        }

        public int noOfZeroes(int[] arr) {
            int count = 0;

            for (int i: arr) {
                if(i == 0)
                    count++;
            }

            return count;
        }
    }
}
