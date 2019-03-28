

//brute force approach
public int[] (int[] nums, int target){
	for (int i = 0; i < nums.length; i++){
		for (int j = i + 1; j < nums.length; j++){
			if(nums[j] == target - nums[i]){
				return new int[] {i , j};
			}
		}
	}
}

//time complexity: O(n^2) space complexity: O(1)

//Two-pass Hash Table
//reduce look up time from O(n) to O(1) by trading space for speed

public int[] (int[] nums, int target){
	Map<Integer,Integer> map = new HashMap<>();
	for (int i = 0; i < nums.length; i++){
		map.put(num[i], i);
	}

	for (int i = 0; i < nums.length; i++){
		int find = target - nums[i];
		if(map.containsKey(find) && map.get(find) != i){
			return new int[] {i,map.get(find)}
		}
	}
	throw new IllegalArgumentException("No two sum solution");
}

//time complexity: O(n) space complexity: O(n)

//One pass Hash Table
public int[] (int[] nums, int target){
	Map<Integer, Integer> map = new HashMap<>();
	for (int i = 0; i < nums.length; i++){
		int complement = target - nums[i];
		if(map.containsKey(complement)){
			return new int[] {i, map.get(complement)};
		}
		map.put(nums[i], i);
	}
}
//time complexity: O(n) space complexity: O(n)