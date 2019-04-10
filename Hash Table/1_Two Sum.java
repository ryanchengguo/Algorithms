class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> newMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            newMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int findValue = target - nums[i];
            //不是.get(findValue) != nums[i] 一定要是!= i 不等于index
            //case [4,4]找8就会返回空指针异常而不是[0,1]
            if(newMap.containsKey(findValue) && newMap.get(findValue) != i){
                return new int[] {i , newMap.get(findValue)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}