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
    public int getDecimalValue(ListNode head) {
        int count = -1;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int sum = 0;
        while (temp != null) {
            sum += (int) (temp.val * Math.pow(2, count));
            count--;
            temp = temp.next;
        }
        return sum;
    }
}