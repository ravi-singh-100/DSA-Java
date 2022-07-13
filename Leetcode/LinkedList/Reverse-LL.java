// Ques: https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode previous=null;
        ListNode present=head;
        ListNode next=present.next;
    while(present!=null){
         present.next=previous;
        previous=present;
        present=next;
        if(next!=null){
             next=next.next;
        }
    }
        return previous;
    }
}
