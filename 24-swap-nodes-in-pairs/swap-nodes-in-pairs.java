class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null && curr.next != null){

            ListNode first = curr;
            ListNode second = curr.next;

            first.next = second.next;
            prev.next = second;
            second.next = first;

            prev = first;
            curr = first.next;
        }

        return dummy.next;
    }
}