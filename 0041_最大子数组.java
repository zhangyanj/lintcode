public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++){
            if(dp[i-1]>0){
                dp[i]=nums[i]+dp[i-1];
            }else{
                dp[i]=nums[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
