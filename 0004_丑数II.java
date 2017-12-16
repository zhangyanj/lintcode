ass Solution {
    /**
     * @param n an integer
     * @return the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        // Write your code here
        if(n<7){
            return n;
        }
        
        int[] dp=new int[n+1];
        dp[1]=1;
        int mid2=1,mid3=1,mid5=1;
        for(int i=2;i<n+1;i++){
            dp[i]=Math.min(dp[mid2]*2,Math.min(dp[mid3]*3,dp[mid5]*5));
            if(dp[i]==dp[mid2]*2) mid2++;
            if(dp[i]==dp[mid3]*3) mid3++;
            if(dp[i]==dp[mid5]*5) mid5++;
        }
        return dp[n];
    }
};

