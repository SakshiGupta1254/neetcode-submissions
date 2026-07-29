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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> s = new HashSet<>();
        while(curr != null){
            if(s.contains(curr.next)){
                return true;
            }
            else{
            curr = curr.next;
            s.add(curr);
            }
        }
        
            return false;
        
    }
}
