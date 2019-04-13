class Solution{
	public boolean containsDuplication(int[] nums){
		Set<Integer> set = new HashSet<>(nums.length);
		for(int x : nums){
			if (set.contains(x)) return true;
			set.add(x);
		}
		return false;
	}
}

//time complexity: O(n) Both search() and insert() for n times and each operation takes constant time
//space complexity: O(n) space use is linear with the number of elements in it.