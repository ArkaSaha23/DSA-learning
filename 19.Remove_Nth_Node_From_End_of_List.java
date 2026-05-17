/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head;
        int remove=count(head)-n+1,flag=1;
         //System.out.println("Count="+count(head)+",Remove="+remove);
         if(count(head)==0)
         {
            return null;
         }
        else if(count(head) == 1)
        {
            return null;
        }
        if(remove == 1)
        {
            return(head.next);
        }
        while(ptr != null)
        {
            if(flag == remove-1)
            {
                ptr.next=ptr.next.next;
            }
            ptr=ptr.next;
            flag++;
        }
        return head;
    }
    public static int count(ListNode head)
    {
        int c=0;
        ListNode ptr=head;
        while(ptr != null)
        {
            ptr=ptr.next;
            c++;
        }
        return c;
    }
}
