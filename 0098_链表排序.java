/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {  
        // write your code here
        ListNode ans=sort(head);
        return ans;
    }
    
    public ListNode sort(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode p1=sort(head);
        ListNode p2=sort(head2);
        ListNode p = mergeTwoLists(p1,p2);
        return p;
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head;
        if(l1.val<l2.val){
            head=l1;
            head.next=mergeTwoLists(l1.next,l2);
        }else{
            head=l2;
            head.next=mergeTwoLists(l1,l2.next);
        }
        return head;
    }
}

