class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prevgroupend = temp;
        while (true) {
            ListNode kth = prevgroupend;
            for (int i = 1; i <= k && kth != null; i++)
                kth = kth.next;
                if (kth == null)
                break;
                ListNode groupstart = prevgroupend.next;
                ListNode nextgroupstart = kth.next;
                ListNode current, prev, nextnode;
            prev = nextgroupstart;
            current = groupstart;
            while (current != nextgroupstart) {
                nextnode = current.next;
                current.next = prev;
                prev = current;
                current = nextnode;
            }
            prevgroupend.next = kth;
            prevgroupend = groupstart;
        }
        return temp.next;
    }
}