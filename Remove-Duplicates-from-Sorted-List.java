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
        Set<Integer> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            set.add(temp.val);
            temp=temp.next;
        }
        List<Integer> al=new ArrayList<>(set);
        Collections.sort(al);
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int val:al){
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return dummy.next;
    }
}