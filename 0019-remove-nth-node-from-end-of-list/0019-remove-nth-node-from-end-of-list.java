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
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        if(count==n){
            return head.next;
        }
        temp = head;
        int end = count - n - 1;
        ListNode prev = null;
        count =0;
        while(temp!=null && count<=end){
            count++;
             prev = temp;
            temp = temp.next;
        } 
        prev.next = temp.next;
        temp.next = null;
        return head;
    }
}