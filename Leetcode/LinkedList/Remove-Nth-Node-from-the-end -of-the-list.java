// Ques:https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        int nodelength=1;
        ListNode ptr=head;
        while(ptr.next!=null){
            nodelength++;
            ptr=ptr.next;
        }
        System.out.println(nodelength);
        if(n==nodelength){
            head=head.next;
        }
        else{

        
        ptr=head;
        while(nodelength-n>1){
            --nodelength;
            ptr=ptr.next;
        }
     
    

        ptr.next=ptr.next.next;
    }
        return head;
    }
}

