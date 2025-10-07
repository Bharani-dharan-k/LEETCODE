/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    if(head == NULL || head->next == NULL)
         return head;
    struct ListNode *r, *p = head, *q = head->next, *t = head->next;
    while(q != NULL){
        p->next = q->next;
        if(p->next != NULL)
           p = p->next;
        q->next = p->next;
        q = p->next;
    }
    p->next = t;
    return head;
}