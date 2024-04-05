public class MakeTheStringGreat {
    class Solution {
        public String makeGood(String s) {
            StringBuilder str = new StringBuilder(s);

            for(int i=0; i+1 < str.length(); ) {

                if((i > -1) && (i < str.length()) && (Math.abs(str.charAt(i) - str.charAt(i+1)) == 32)) {
                    str.deleteCharAt(i+1);
                    str.deleteCharAt(i);
                    i--;
                }
                else {
                    i++;
                }
            }

            return str.toString();
        }
    }
}
