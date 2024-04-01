public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;

            for(int i=s.length()-1; i>=0; i--) {
                if(s.charAt(i) != ' ')
                    length++;
                if(length > 0 && s.charAt(i) == ' ')
                    break;
            }

            return length;
        }
    }
}
