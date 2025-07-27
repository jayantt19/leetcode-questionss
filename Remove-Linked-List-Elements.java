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
    public ListNode removeElements(ListNode head, int val) {
       ArrayList<Integer> set=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
           if(temp.val!=val){
           set.add(temp.val);
           }
        temp=temp.next;
       }
       ListNode dummy=new ListNode(-1);
       ListNode curr=dummy;
       for(int t:set){
        curr.next=new ListNode(t);
        curr=curr.next;
       }
       return dummy.next;
    }
}