public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
	    if(nums==null||nums.length==0){
	        return 0;
	    }
	    int fir=0;
	    int last=nums.length-1;
	    while(fir<last){
	        while(fir<last&&nums[fir]<k){
	            fir++;
	        }
	        while(fir<last&&nums[last]>=k){
	            last--;
	        }
	        int temp=nums[fir];
	        nums[fir]=nums[last];
	        nums[last]=temp;
	    }
	    if(fir==nums.length-1){
	        return fir+1;
	    }
	    return fir;
    }
}
