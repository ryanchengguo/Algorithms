class Solution {
	public int[] plusOne(int[] digits){

		// if(digits.length == 0 || digits == null) return digits;
		
		//case 123 -> 124
		//case 129 -> 130
		for(int i = digits.length; i >= 0; i--){
			if(digits[i] + 1 <= 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		//case 9 -> 10
		//case 9999 -> 10000
		int[] newArray = new int[digits.length + 1];
		newArray [0] = 1;
		return newArray;
	}
}

//Time complexity O(n) Space complexity O(n)

