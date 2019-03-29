class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        
        if(target > nums[nums.length - 1]) return nums.length;
        
        for(i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                break;
            }
        }
        
        return i;
    }
}