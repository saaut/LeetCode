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
    public ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode node;
        node=head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        ListNode dummy = new ListNode(-1);
        node=dummy;
        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
        }
        
        node.next = null;
        return dummy.next;

    }
}