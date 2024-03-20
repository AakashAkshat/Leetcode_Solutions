public class MergeInBetweenLinkedList {
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode first = list1;
            ListNode last = list1;

            while (first.next != null && a > 1) {
                a--;
                first = first.next;
            }

            while (last.next != null && b >= 0) {
                b--;
                last = last.next;
            }

            ListNode tail = list2;
            while(tail.next != null) {
                tail = tail.next;
            }

            tail.next = last;
            first.next = list2;

            return list1;
        }
    }
}
