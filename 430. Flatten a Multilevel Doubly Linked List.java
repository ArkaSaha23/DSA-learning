/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node cur=head;
        Node Next=cur.next,flattenNodes;
        while(cur != null){
            if(cur.child != null){//recursive and backtracking imp step
                Next=cur.next;
                flattenNodes=flatten(cur.child);
                cur.next=flattenNodes;
                flattenNodes.prev=cur;
                cur.child=null;
               
                while(cur.next != null){//to reach tail
                    cur=cur.next;
                } 
                if(Next != null){//connect with next pointer
                   cur.next=Next;
                   Next.prev=cur;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}
