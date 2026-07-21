class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean k = false;
        for(int i =0; i< matrix.length;i++){
            if(target >= matrix[i][0]  && target <= matrix[i][n-1]){
                int l = 0;
                int r = n-1;
                int mid = (r-l)/2;
                while(l<=r){
                    if(target > matrix[i][l]  && target < matrix[i][mid]){
                        r = mid;
                    }
                    else if(target > matrix[i][mid]  && target < matrix[i][r])
                    {
                        l= mid;
                    }
                    else if(target == matrix[i][l] ||target == matrix[i][r] ||target == matrix[i][mid]){
                        return true;
                    }
                    l++;
                    r--;
                }

            }
        }
        return k;
    }
}
