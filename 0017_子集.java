class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        ArrayList<Integer> temp=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int last=nums.length-1;
        main(ans,temp,nums,0);
        return ans;
    }
    public void main(ArrayList<ArrayList<Integer>> ansarr,ArrayList<Integer> arr,int[] nums,int k){
            ansarr.add(new ArrayList<Integer>(arr));
            for(int i=k;i<nums.length;i++){
                arr.add(nums[i]);
                main(ansarr,arr,nums,i+1);
                arr.remove(arr.size()-1);
            }
    }
}
