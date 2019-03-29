class LinearTimeSolution {
	public int maxSubArray(int[] nums){
		int maxSoFar = nums[0];
		int maxEndingHere = nums[0];

		for(int i =1; i < nums.length; i++){
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);

			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
}

//O(n) Kadane's Algorithm
//dynamic programming, recursion, backtracking
//Back To Back SWE
