public class RepeatedSubstringPattern {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            String str = s + s;
            // for(int i=1; i+s.length() < str.length(); i++) {
            //     if(str.substring(i, i+s.length()).equals(s))
            //         return true;
            // }

            // return false;

            return str.substring(1, str.length()-1).contains(s);
        }
    }
}
