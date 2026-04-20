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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(   //making customizable Priority queue
            (a, b) -> Integer.compare(a.val, b.val)
        );

        for(int i = 0 ; i < lists.length ; i++)
        {
            if(lists[i] != null)
            {
                pq.add(lists[i]);                    //adding the starting nodes in PQ
            }
        }

        ListNode ptr=new ListNode(-1);
        ListNode temp=ptr;

        while(!pq.isEmpty())
        {
            ListNode delNode=pq.poll();            // deleting the smallest node from PQ 
            temp.next=delNode;                     // pointing the next pointer of resultant list to that deleted list
            temp=delNode;                          // moving the temp pointer to next node(deleted node)

            if(delNode.next != null)
            {                                     // If there's a next node in the same list, add it to heap
                pq.add(delNode.next);
            }
        }
        return ptr.next;
    }
}
