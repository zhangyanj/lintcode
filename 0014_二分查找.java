class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
                               
            if(nums[mid]>=target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(nums[end+1]==target){
            return end+1;
        }
        return -1;
    }
}
