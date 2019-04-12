import java.util.Hashtable;

class Solution{
	public int singleNumber(int[] nums){
		Hashtable<Integer, Integer> hashTable = new Hashtable<>();
		for(int i = 0; i < nums.length; i++){
			if(hashTable.containsKey(nums[i])){
				hashTable.remove(nums[i]);
			}else{
				hashTable.put(nums[i], nums[i]);
			}
		}
		Set<Integer> k = hashTable.keySet();
		int result = 0;
		for(int i : k){
			result = i;
		}
		return result;
	}
}