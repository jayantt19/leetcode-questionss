class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        
        ArrayList<Integer> al = new ArrayList<>();
        while(list1 != null) {
            al.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null) {
            al.add(list2.val);
            list2 = list2.next;
        }
        
        Collections.sort(al);
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for(int val : al) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
}
