// Ques:https://leetcode.com/problems/sort-list/

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
    public ListNode sortList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
       ListNode n1= sortList(head);
      ListNode n2=  sortList(temp);
        return merge(n1,n2);
    }
    public ListNode merge(ListNode ptr1,ListNode ptr2){
        ListNode head;

        if(ptr1.val<=ptr2.val){
            head=ptr1;
            ptr1=ptr1.next;
        }
        else {
            head=ptr2;
            ptr2=ptr2.next;
        }
        head.next=null;
        ListNode temp=head;
        while(ptr1!=null&&ptr2!=null){
            if(ptr1.val<=ptr2.val){
                temp.next=ptr1;
                ptr1=ptr1.next;
                 temp=temp.next;
                temp.next=null;
            }
            else{
                temp.next=ptr2;
                ptr2=ptr2.next;
                temp=temp.next;
                temp.next=null;
            }
        }
        if(ptr1!=null){
            temp.next=ptr1;
        }
       else{
           temp.next=ptr2;
       }
        return head;
    }
}
