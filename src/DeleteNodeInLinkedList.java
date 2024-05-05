public class DeleteNodeInLinkedList {
    class Solution {
        public void deleteNode(ListNode node) {
            // replace the value delete node by its value of next node
            node.val = node.next.val;
            // then romove next node
            node.next = node.next.next;
        }
    }
}
