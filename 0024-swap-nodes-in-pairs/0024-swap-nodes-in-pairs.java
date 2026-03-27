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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)    return head;
        ListNode temp = head;

        while(temp.next != null){
            swap(temp,temp.next);
            if(temp.next.next!=null)    temp = temp.next.next;
            else break;
        }

        return head;
    }
    public void swap(ListNode t1,ListNode t2){
            int temp = t1.val;
            t1.val = t2.val;
            t2.val = temp;
    }
}