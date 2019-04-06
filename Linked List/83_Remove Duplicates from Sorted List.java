class Solution{
	public ListNode deleteDuplicates(ListNode head){
		ListNode current = head;
		while(current != 0 && current.next != 0){
			if(current.val == current.next.val){
				current.next = current.next.next;
			}else{
				current = current.next;
			}
		}
		return head;
	}
}

//time complexity: O(n) each node in the list is checked once
//space complexity: O(1) no additional space is used
