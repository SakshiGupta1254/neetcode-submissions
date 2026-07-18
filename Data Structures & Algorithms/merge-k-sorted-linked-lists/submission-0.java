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
    public ListNode mergeKLists(ListNode[] lists) {

      int size = lists.length;
      int interval = 1;
        if(lists == null || size <= 0){
        return null;
      }

      while (interval < size){
        for(int i=0;i+interval < size;i += interval * 2){
            lists[i] = mergedlist(lists[i], lists[i+interval]);
        }
        interval *= 2;
      }
     
      
      
      return lists[0];
    }
    public ListNode mergedlist(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
            while( l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    tail.next = l1;
                    l1 = l1.next;

                }
                else{
                    tail.next = l2;
                    l2 = l2.next;
                }
               tail = tail.next; 
            }
            if(l2 != null){
                tail.next = l2;
            }
            else if(l1 != null){
                tail.next = l1;
            }
            return dummy.next;
      }
}
