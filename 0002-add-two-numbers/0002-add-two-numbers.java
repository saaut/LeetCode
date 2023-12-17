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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode node = dummy;
        int carry=0;
        int num1,num2=0;
        while(l1!=null|| l2!=null){
            if(l1!=null)
                num1=l1.val;
            else num1=0;
            if(l2!=null)
                 num2=l2.val;
            else num2=0;
            int sum=num1+num2+carry;
            
            node.next=new ListNode(sum%10);
            node=node.next;
            carry=sum/10;
            
            if(l1!=null) l1= l1.next;
            if(l2!=null) l2= l2.next;
        }
        if(carry>0) node.next= new ListNode(carry);
        return dummy.next;
    }
}