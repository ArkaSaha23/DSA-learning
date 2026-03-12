/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        if(head.next == head) return  true;
        ListNode fast=head;
        ListNode slow=head;
        //fast!=null for even no. linkedlist
        //fast.next != null for odd no.of linked list
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
