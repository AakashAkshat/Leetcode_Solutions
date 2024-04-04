public class MaximumNestingDepthOfTheParentheses {
    class Solution {
        public int maxDepth(String s) {
            int ans = 0;
            int openParenthesis = 0;

            for(char c : s.toCharArray()) {
                if(c == '(')
                    ans = Math.max(ans, ++openParenthesis);
                else if(c == ')')
                    openParenthesis--;
            }

            return ans;
        }
    }
}
