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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dum  = head;
        while(dum != null && dum.next != null){
            if(dum.val == dum.next.val){
                dum.next = dum.next.next;
            }
            else dum = dum.next;
        }
        return head;
    }
}