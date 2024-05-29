public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {
    class Solution {
        public int numSteps(String s) {
            int step = 0;
            // corner case
            if (s.length() == 1) {
                if (s.charAt(0) == '0') {
                    step++;
                }
                return step;
            }

            // normal case
            int carry = 0;
            for (int i = s.length() - 1; i > 0; i--) {
                // '0'
                if (s.charAt(i) == '0') {
                    if (carry == 0) {
                        // 右移一步
                        step++;
                    } else {
                        step += 2;
                        carry = 1;
                    }
                }
                // '1'
                else {
                    if (carry == 0) {
                        step += 2;
                    } else {
                        step++;
                    }
                    carry = 1;
                }
            }
            return step + carry;
        }
    }
}
