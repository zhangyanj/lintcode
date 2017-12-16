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
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head==null||head.next==null){
            return head;
        }
        ListNode fir=new ListNode(0);
        ListNode ans=fir;
        ListNode sec=new ListNode(0);
        ListNode sec2=sec;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode t=new ListNode(temp.val);
                fir.next=t;
                fir=fir.next;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val>=x){
                ListNode t=new ListNode(temp.val);
                sec.next=t;
                sec=sec.next;
            }
            temp=temp.next;
        }
        fir.next=sec2.next;
        return ans.next;
    }
}

