// Ques:https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        ListNode pre=null;
        while(slow!=null&&slow.next!=null){
            ListNode temp=fast.next;
            slow.next=temp;
            fast.next=slow;
            if(head==slow){
                head=fast;
            }
          pre=slow;
            slow=temp;
            if(temp!=null){
                fast=temp.next;
                pre.next=fast;
            }
            
            else {
                fast=null;
            }
          
        }
        if(slow!=null){
            pre.next=slow;
        }

        return head;
    }
}
