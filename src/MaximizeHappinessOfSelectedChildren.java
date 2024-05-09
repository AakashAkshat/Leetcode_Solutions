public class MaximizeHappinessOfSelectedChildren {
    class Solution {
        public long maximumHappinessSum(int[] happiness, int k) {
            long max = 0;

            Arrays.sort(happiness);

            int i=0;

            for(int j=0; j<k; j++) {
                int curr = happiness[happiness.length-1-i];
                if((curr - j) > 0)
                    max += (curr - j);

                i++;
            }

            return max;
        }
    }
}
