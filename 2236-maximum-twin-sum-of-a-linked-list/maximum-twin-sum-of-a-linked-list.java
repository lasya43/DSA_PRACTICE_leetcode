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
    public int pairSum(ListNode head) {

            // if (head == null || head.next == null) return;
        
       
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
      
        ListNode prev = slow;
        ListNode curr = slow.next;
        slow.next = null; // Sever link between first and second half
        
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        ListNode first=head;
        ListNode second=prev;
       int max=0;
        while(second!=null){

            int val=first.val+second.val;
            max=Math.max(val,max);
            first=first.next;
            second=second.next;
        }
        return max;
        
    }
}