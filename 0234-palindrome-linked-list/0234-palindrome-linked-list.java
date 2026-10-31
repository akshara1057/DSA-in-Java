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
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
            return true;
        }
        ListNode temp = head;
        ListNode i = temp;
        ListNode j = temp;
        while(j!=null && j.next!=null){
            i = i.next;
            j=j.next.next;
        }
        ListNode prev = null;
        ListNode curr = i;
        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        while(prev!=null){
            if(temp.val !=prev.val){
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
}