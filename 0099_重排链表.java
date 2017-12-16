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
     * @return: void
     */
    public void reorderList(ListNode head) {  
        // write your code here
        if(head==null||head.next==null){
            return;
        }
        HashMap<Integer,ListNode> map=new HashMap<Integer,ListNode>();
        ListNode head1=head;
        int len=0;
        while(head1!=null){
            map.put(len,head1);
            head1=head1.next;
            len++;
        }
        ListNode cur=head;
        for(int i=0;i<(len-1)/2;i++){
            ListNode next=cur.next;
            cur.next=map.get(len-1-i);
            cur.next.next=next;
            cur=cur.next.next;
        }
        if(len%2==1){
            cur.next=null;
        }else{
            cur.next.next=null;
        }
    }
}

