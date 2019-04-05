class Solution{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		ListNode p1 = l1, p2 = l2;

		while(p1 != null & p2 != null){
			if(p1.val <= p2.val){
				current.next = p1;
				p1 = p1.next;
			}else{
				current.next = p2;
				p2 = p2.next;
			}
			current = current.next;
		}
		current.next = p1 != null ? p1 : p2;
		return dummyHead.next;
	}
}

//Time complexity: O(m+n)
//Space complexity: O(1) no extra space