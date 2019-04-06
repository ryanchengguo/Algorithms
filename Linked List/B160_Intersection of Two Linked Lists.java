class Solution{
	public LinkNode getIntersectionNode(ListNode headA, ListNode headB){
		HashSet<LinkNode> visited = new HashSet<>();
		HashNode p1 = headA, p2 = headB;
		while(p1 != null){
			visited.add(p1);
			p1 = p1.next;
		}
		while(p2 != null){
			if(visited.contains(p2)){
				return p2;
			}
			p2 = p2.next;	
		}
		return null;
	}
}

//time complexity: O(m+n)
//space complexity: O(m) or O(n)
