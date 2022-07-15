// Ques: https://leetcode.com/problems/reorder-list/

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
    public void reorderList(ListNode head) {
        ListNode ptr1=head;
    
       ListNode ptr2= reverse(mid(head));
     
        ListNode temp1=null;
        ListNode temp2=null;
        while(ptr2.next!=null){
            // temp1=ptr1.next;
            // ptr1.next=ptr2;
            // temp2=ptr2.next;
            // ptr2.next=temp1;
            // ptr1=temp1;
            // ptr2=temp2;
            temp1=ptr1;
            temp2=ptr2;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            temp1.next=temp2;
            temp2.next=ptr1;
           
        }
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
                slow=slow.next;
        }
        return slow;
    }
}
