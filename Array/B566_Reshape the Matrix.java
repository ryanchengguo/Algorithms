class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
 
        Queue<Integer> q = new LinkedList <>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                q.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = q.remove();
            }
        }
        return res;
    }
}

//Time complexity: O(m*n) traverse the entire matrix of size m * n once only. 
//m and n refers to the number of rows and columns in the given matrix.
//Space complexity: O(m*n) The resultant matrix of size m * n is used.