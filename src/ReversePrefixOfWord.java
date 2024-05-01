public class ReversePrefixOfWord {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = -1;

            for(char c : word.toCharArray()) {
                if(c == ch) {
                    index = word.indexOf(ch);
                    break;
                }
            }

            if(index == -1)
                return word;

            String revWord = "";

            for(int i=index; i>=0; i--) {
                revWord += word.substring(i, i+1);
            }

            revWord += word.substring(index+1, word.length());

            return revWord;
        }
    }
}
