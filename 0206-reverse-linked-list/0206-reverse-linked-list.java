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
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode newTail = null;
        ListNode curr,prev = null;
        while(head != null){
            prev = null;
            curr = head;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            if(prev != null) prev.next = curr.next;
            else head = curr.next;
            if(newHead == null){
                newHead = newTail = curr;
            }
            else{
                newTail = newTail.next = curr;
            }
        }
        return newHead;
    }
}