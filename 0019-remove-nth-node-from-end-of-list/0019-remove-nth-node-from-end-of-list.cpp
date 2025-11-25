/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int i = 1;
        ListNode* slow = head, *fast = head;
        ListNode* prev = NULL;
        for( ; i < n; fast = fast->next, i++);
        while(fast && fast->next){
            prev = slow;
            slow = slow->next;
            fast = fast->next;
        }
        if(prev) prev->next = slow->next;
        else head = slow->next;
        return head;
    }
};