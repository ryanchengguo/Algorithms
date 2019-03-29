class Solution{
	public int removeElement(int[] nums, int val){
		int i = 0;
		for (j = 0; j < nums.length; j++){
			if (nums[j] != val){
				num[i] = num[j];
				i++;
			}
		}
		return i;
	}
}