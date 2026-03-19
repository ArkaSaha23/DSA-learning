/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */we will seperate each kth group and send that grp to reverse()
//we will store the previous grp list as "PrevGrpNode" and the next grp list as "nextGrpNode"

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prevGrpNode=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode == null){                     //if the grp size is less than k  
                if(prevGrpNode!=null){                 //if previous Group's last node is not null(not true for first grp)
                    prevGrpNode.next=temp;             //THEN point the prev.next to temp;
                    return head;
                }
                break;
            }
            ListNode nextGrpNode=kthNode.next;        //storing the next grp pointer
            kthNode.next=null;                        //breaking the link of the current grp from next node
            reverse(temp);                            //reverse the current node
            if(temp==head){                           //THIS CONDITION IS TRUE FOR FIRST GRP WHERE THE HEAD WILL BE UPDATED TO "kthNode"
                head=kthNode;
            }else{
                prevGrpNode.next=kthNode;             //for 2nd,3rd,4rt... grp the prev grp pointer will be linked to the current reversed grp
            }
            prevGrpNode=temp;                         //pointing the prev grp to the current grp
            temp=nextGrpNode;                         //updating the temp to new grp
        }
        return head;        
    }
    public ListNode findKthNode(ListNode head, int k) {
        ListNode curr = head;
        for (int i = 1; i < k; i++) {
            if (curr == null) return null;
            curr = curr.next;
        }
        return curr;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,cur=head,next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
