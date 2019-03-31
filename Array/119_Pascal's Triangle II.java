class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currRow = new ArrayList<Integer>();
        for(int i = 0; i < rowIndex+1; i++){
            currRow.add(0,1);
            for(int j = 1; j < i; j++){
                currRow.set(j, currRow.get(j) + currRow.get(j+1));
            }
        }
        return currRow;
    }
}

//k iterations will go through elements these many times: 
//1 (first iteration) + 2 (second iteration) + .. k (kth iteration) = k(k+1)/2 
//time complexity: O(k^2), space complexity is O(k)