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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 1;
        ListNode leftNode=null,rightNode=null;
        ListNode ptr = new ListNode(-1);
        ptr.next=head;
        ListNode prev=ptr;
        ListNode cur=head;
        while (cur != null) {
            if (i==left) {
                leftNode = cur;
                break;
            }
            prev = cur;  
            cur = cur.next;
            i++;
        }
        rightNode = leftNode;
        for (int j=left ; j<right ; j++){
            rightNode=rightNode.next;
        }
        ListNode nextNode=rightNode.next;//storing the nextNode of the rightNode
        prev.next = null;          //breaking the prevNode pointer to leftNode
        rightNode.next = null;     //breaking the rightNode pointing to nextNode
        reverse(leftNode);         //reverse the list
        prev.next = rightNode;     //linking prev to rightNode    
        leftNode.next = nextNode;  //linking the leftNode to next node
        return ptr.next;
    }

    public ListNode reverse(ListNode head){
        ListNode cur = head, prev = null, next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
