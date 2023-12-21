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
import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> que= new PriorityQueue<>(Comparator.comparingInt(x->x.val));
        for(ListNode list:lists){
            if(list!=null){
                que.offer(list);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(!que.isEmpty()){
            ListNode min=que.poll();
            cur.next=min;
            cur=cur.next;
            if(min.next!=null) que.add(min.next);
        }
        return dummy.next;
    }
}