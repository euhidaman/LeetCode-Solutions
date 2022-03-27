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
        
        if(head.next==null && n==1)
        {
            head = null;
            
        } else {
            
            ListNode cur = head;
            int count = 0;
            while(cur!=null)
            {
                cur = cur.next;
                count++;
            }
            
            ListNode prev = null;
            int remove = count-n;
            count=0;
            cur = head;
            while(cur!=null && count!=remove)
            {
                prev = cur;
                cur = cur.next;
                count++;
            }
            
            if(remove==0)
            {
                head = head.next;
            }
            else if(count == remove)
            {
                prev.next = cur.next;
            }
        }
        
        return head;
    }
}