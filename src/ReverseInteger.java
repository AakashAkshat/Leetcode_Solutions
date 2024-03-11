public class ReverseInteger {

    class Solution {
        public int reverse(int x) {
            long ans = 0;

            boolean isNegative = false;

            if(x < 0) {
                isNegative = true;
                x = (-1) * x;
            }


            while(x > 0) {
                ans = ans*10 + (x%10);
                x = x/10;
            }

            if(ans > Integer.MAX_VALUE)
                return 0;

            if(isNegative) {
                ans = (-1) * ans;
            }

            return (int)ans;
        }
    }
}
