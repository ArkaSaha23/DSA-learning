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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode l3=new ListNode();  
        int carry=0;
        ListNode srt=l3;
        while(l1 != null || l2 != null)
        {
            int val1=0,val2=0;
            if(l1 != null)
            {
                val1=l1.val;
                l1=l1.next;
            }
            if(l2!= null)
            {
                val2=l2.val;
                l2=l2.next;
            }
            int res = val1+ val2 + carry;
            carry=res/10;
            l3.next=new ListNode(res%10);
            l3=l3.next;
        }
        if(carry>0)
        {
            l3.next=new ListNode(carry);
        }             
        return(srt.next);
    }
}
