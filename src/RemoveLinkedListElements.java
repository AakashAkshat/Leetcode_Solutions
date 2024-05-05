public class RemoveLinkedListElements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode temp = head;

            if(head == null)
                return head;

            ListNode newHead = new ListNode(-1);
            ListNode newTemp = newHead;


            while(temp != null) {
                if(temp.val != val) {
                    newTemp.next = temp;
                    newTemp = newTemp.next;
                }
                else {
                    newTemp.next = temp.next;
                }

                temp = temp.next;

            }
            return newHead.next;
        }
    }
}
