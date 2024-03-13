public class FindThePivotInteger {
    class Solution {
        public int pivotInteger(int n) {

            int sum = n*(n+1)/2;
            if(n == sum) {
                return n;
            }
            int count = 0;

            for(int i=n; i>=1; i--) {

                count+=i;
                if(sum == count)
                    return i;

                sum = sum-i;

                //    count = count + i;
            }

            return -1;
        }
    }
}
