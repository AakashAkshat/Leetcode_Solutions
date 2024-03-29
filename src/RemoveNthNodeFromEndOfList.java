public class RemoveNthNodeFromEndOfList {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            // find the length of Linked List
            int length = 0;
            ListNode temp = head;
            while(temp != null) {
                temp = temp.next;
                length++;
            }

            // check length == n
            if(length == n) {
                head = head.next;
                return head;
            }

            ListNode node = head;
            for(int i=1; i<length-n; i++) {
                node = node.next;
            }

            // check null exception
            if(node.next != null)
                node.next = node.next.next;

            return head;
        }


    }
}
