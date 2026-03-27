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
    public void reorderList(ListNode head) {

        ArrayList<Integer> ele = new ArrayList<>();
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            ele.add(temp.val);
            n++;
            temp = temp.next;
        }
        temp = head;
        int k = n-1,i=0;
        
        while(temp != null){
            temp.val = ele.get(i++);
            if(temp.next != null){
                temp = temp.next;
                temp.val = ele.get(k--);
            }
            else break;
            temp = temp.next;
        }

    }
}