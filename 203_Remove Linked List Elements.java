class Solution{
	public ListNode removeElements(ListNode head, int val){
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		current.next = head;
		while(current.next != null){
			if(current.next.val == val){
				current.next = current.next.next;
			}
			current = current.next;
		}
		return dummyHead.next;
	}
}