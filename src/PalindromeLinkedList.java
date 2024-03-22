public class PalindromeLinkedList {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            String num = "";
            ListNode temp = head;

            while(temp != null) {
                num += temp.val;
                temp = temp.next;
            }

            temp = head;

            for(int i=num.length()-1; i>=0; i--) {
                if((int)num.charAt(i)-48 != temp.val){
                    return false;
                }

                temp = temp.next;
            }

            return true;
        }
    }
}
