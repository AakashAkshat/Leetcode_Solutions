public class ReOrderList {
    lass Solution {
        public void reorderList(ListNode head) {
            ListNode mid = head;
            ListNode temp = head.next;

            while(temp != null && temp.next != null) {
                mid = mid.next;
                temp = temp.next.next;
            }

            ListNode prev = null;
            ListNode curr = mid;
            ListNode next;

            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode leftHead = head;
            ListNode rightHead = prev;
            ListNode nextLeft, nextRight;
            while(leftHead != null && rightHead != null) {
                nextLeft = leftHead.next;
                leftHead.next = rightHead;
                nextRight = rightHead.next;
                rightHead.next = nextLeft;

                leftHead = nextLeft;
                rightHead = nextRight;
            }

        }
    }
}
