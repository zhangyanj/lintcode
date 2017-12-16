/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if(m == n){
            return head;
        }
        ListNode preM = null;
        ListNode nextN = null;
        ListNode nowM = null;
        ListNode nowN = null;
        int count = 1;
        ListNode anoHead = head;
        while(anoHead != null){
            if(count == m-1){
                preM = anoHead;
            }
            if(count == m){
                nowM = anoHead;
            }
            if(count == n+1){
                nextN = anoHead;
            }
            if(count == n){
                nowN = anoHead;
            }
            count++;
            anoHead = anoHead.next;
        }
        
        if(preM != null){
            preM.next = Work(nowM,nowN);
            if(nextN != null){
                nowM.next = nextN;
            }
            return head;
        }else{
            head = Work(nowM,nowN);
            if(nextN != null){
                nowM.next = nextN;
            }
            return head;
        }
    }
    
    public ListNode Work(ListNode head,ListNode tail){
        ListNode pre = null;
        ListNode now = head;
        ListNode next = head;
        while(now != tail){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        now.next = pre;
        return now;
    }
}
