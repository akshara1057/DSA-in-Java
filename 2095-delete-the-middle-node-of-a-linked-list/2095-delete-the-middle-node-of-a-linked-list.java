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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode temp = head;
        if(head.next==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int del = 0;
        if(count%2==0){
            del = count/2;
        }
        else{
            del = count/2;
        }
        int i = 1;
        temp = head;
        while(temp!=null && i<del){
            temp = temp.next;
            i++;
        }
        ListNode extra = temp.next;
        temp.next = temp.next.next;
        extra.next = null;
        return head;
    }
}