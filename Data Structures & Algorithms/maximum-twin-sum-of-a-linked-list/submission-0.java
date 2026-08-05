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
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode curr = head;
        int counter = 0;
        int n =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(b,a));
        HashMap<Integer,Integer> all = new HashMap<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        while(curr != null){
            all.put(counter, curr.val);
            curr = curr.next;
            counter++;
        }
        while(f != null && f.next != null){
            m.put(n,(counter-1-n));
            s= s.next;
            f = f.next.next;
            n++;
        }
        for(int i =0 ;i<m.size();i++){
            pq.add(all.get(i) + all.get(m.get(i)));
        }
        System.out.println(all);
        if(!pq.isEmpty()){
            return pq.poll();
        }
        else{
            return -1;
        }
        
    }
}

//  0,3
// 1,2
// 2,1
//3, 0

// 0,3
//1,2