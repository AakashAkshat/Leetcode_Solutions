import java.util.Stack;

public class DoubleANumberRepresentedAsALinkedList {
    class Solution {
        public ListNode doubleIt(ListNode head) {
            Stack<ListNode> stack = new Stack<>();

            ListNode temp = head;

            while(temp != null) {
                stack.push(temp);
                temp = temp.next;
            }

            temp = null;

            int carry = 0;

            while(!stack.isEmpty()) {
                int num = 2*stack.pop().val;
                int dig = num%10 + carry;
                carry = num/10;

                ListNode node = new ListNode(dig);
                node.next = temp;
                temp = node;
            }

            if(carry > 0) {
                ListNode node = new ListNode(carry);
                node.next = temp;
                temp = node;
            }

            return temp;
        }
    }
}
