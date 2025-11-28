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
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode result = new ListNode(0);
        ListNode tail = result;
        int carry = 0;
        int x, y = 0;
        while(temp1 != null || temp2 != null){
            //if(temp1.next.val != null || temp2.next.val != null)
            x = temp1 != null ? temp1.val : 0;
            y = temp2 != null ? temp2.val : 0;
            int sum = x + y + carry;
            if(sum > 9){
                carry = sum/10;
                sum = sum % 10;

            }
            else{
                carry = 0;
            }
            tail.next = new ListNode(sum);
            tail = tail.next;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return reverse(result.next);
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}