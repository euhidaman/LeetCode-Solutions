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
    
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode cur = head;
        while(cur!=null)
        {
            ++len;
            cur = cur.next;
        }
        
        ListNode cur1 = head;
        ListNode cur2 = head;
            
            
        int c1 = 0;
        while(c1!=k-1)
        {
            cur1 = cur1.next;
            ++c1;
        }
        
        int c2 = 0;
        while(c2!=len-k)
        {
            cur2 = cur2.next;
            ++c2;
        }
        
        int temp = cur1.val;
        cur1.val = cur2.val;
        cur2.val = temp;
        
        return head;
    }
}