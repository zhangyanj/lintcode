public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if(nums.size() == 0){
            return 0;
        }
        int sum = nums.get(0);
        int min = Integer.MAX_VALUE;
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++){
            sum = sum + nums.get(i);
            min = min<(sum - max)?min:(sum - max);
            min = min<sum?min:sum;
            max = max>sum?max:sum;
        }
        return min<nums.get(0)?min:nums.get(0);
    }
}
