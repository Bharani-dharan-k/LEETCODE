class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tail = result;
        ListNode temp1 = l1;
        while (temp1 != null) {
            tail.next = new ListNode(temp1.val);
            tail = tail.next;
            temp1 = temp1.next;
        }
        ListNode temp2 = l2;
        while (temp2 != null) {
            tail.next = new ListNode(temp2.val);
            tail = tail.next;
            temp2 = temp2.next;
        }
        List<Integer> arr = new ArrayList<>();
        ListNode temp = result.next;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        ListNode sortedDummy = new ListNode(0);
        ListNode ptr = sortedDummy;
        for (int value : arr) {
            ptr.next = new ListNode(value);
            ptr = ptr.next;
        }
        return sortedDummy.next;
    }
}
