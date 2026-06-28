class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int[][] dp = new int[r][c];
        for(int i = 0; i <r ;i++){
            for (int j=0; j<c ;j++){
                if(i ==0 && j==0 && obstacleGrid[i][j] != 1) {
                    dp[i][j] = 1;
                }
                else if(obstacleGrid[i][j] == 1){
                    dp[i][j] =0;
                }
                else{
                    int up = 0;
                    int left = 0;
                    if(j>0) up = dp[i][j-1];
                    if(i>0) left = dp[i-1][j];

                    dp[i][j] = up+left;
                }
            }
        }
      return dp[r-1][c-1];
}
}