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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(-1);
        ListNode prev = result;
        ListNode curr = head;
        ListNode tail = null;
        int index = 0;
        while(curr != null){
            tail = curr;
            while(curr != null && index++ < k){
                curr = curr.next;
            }
            if(index >= k){
                index = 0;
                prev.next = reverseList(tail,k);
                prev = tail;
            }
            else{
                prev.next = tail;
            }
        }
        return result.next;
    }
    public ListNode reverseList(ListNode head,int k){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null && k-- > 0){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}