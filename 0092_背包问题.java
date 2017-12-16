public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
     
     
     
    public int backPack(int m, int[] A) {
        // write your code here
        if(m==0){
            return 0;
        }
        if(A==null||A.length==0){
            return 0;
        }
        int len=A.length;
        int[][] dp=new int[len+1][m+1];
        dp[0][0]=0;
        for(int i=1;i<len+1;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<m+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<len+1;i++){
            for(int j=1;j<m+1;j++){
                if(j>=A[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j],(dp[i-1][j-A[i-1]]+A[i-1]));
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[len][m];
    }
}
