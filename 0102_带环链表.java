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
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        if(head==null){
            return false;
        }
        ListNode fir=head;
        ListNode sec=head.next;
        while(fir!=sec){
            if(fir==null||sec==null){
                return false;
            }
            fir=fir.next;
            if(sec.next==null){
                return false;
            }
            if(sec.next.next==null){
                return false;
            }
            sec=sec.next.next;
        }
        return true;
    }
}

