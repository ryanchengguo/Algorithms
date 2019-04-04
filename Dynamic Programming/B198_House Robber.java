//case [1.2.3.1] expected: 4
//case [2,7,9,3,1] expected: 12
//case [2,1,1,2] expected: 4 (3 is incorrect)


class Solution{
	public int rob(int[] nums){
		int even_num = 0;
		int odd_num = 0;
		for(int i = 0; i < nums.length; i++){
			if(i % 2 == 0){
				even_num = Math.max(even_num + nums[i], odd_num);
			}else {
				odd_num = Math.max(odd_num + nums[i], even_num);
			}
		}
		return Math.max(even_num, odd_num);
	}
}