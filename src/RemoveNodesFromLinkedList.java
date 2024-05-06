public class RemoveNodesFromLinkedList {
    class Solution
    {
        public ListNode removeNodes(ListNode head)
        {
            ListNode reverse = null;
            while(head != null)
            {
                ListNode temp = head.next;
                head.next = reverse;
                reverse = head;
                head = temp;
            }

            ListNode remove = null;
            int max = reverse.val;
            remove = reverse;
            reverse = reverse.next;
            remove.next = null;

            while(reverse != null)
            {
                if(max <= reverse.val)
                {
                    max = reverse.val;
                    ListNode temp = reverse.next;
                    reverse.next = remove;
                    remove = reverse;
                    reverse = temp;
                }
                else
                    reverse = reverse.next;
            }

            return remove;
        }
    }
}
