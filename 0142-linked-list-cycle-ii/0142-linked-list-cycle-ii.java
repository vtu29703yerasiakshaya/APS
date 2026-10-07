public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s,f,e;
        s=f=head;
        while(f!=null&&f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(f==s)
            {
                e=head;
                while(s!=e)
                {
                    s=s.next;
                    e=e.next;
                }
                return e;
            }
        }
        return null;
    }
}