public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums==null || nums.length==0){
            return 0;
        }
        int len=nums.length;
        int[] ans=new int[len];
        for(int i=0; i<len; i++){
            ans[i]=1;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    ans[i]=Math.max(ans[i],ans[j]+1);
                }
            }
        }
        int maxans=0;
        for(int i=0; i<ans.length; i++){
            maxans=Math.max(ans[i],maxans);
        }
        return maxans;
    }
}

