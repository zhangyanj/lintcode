class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // Write your code here
        HashSet<Integer> set=new HashSet<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        main(set,ans,temp,nums);
        return ans;
    } 
    
    void main(HashSet<Integer> set,List<List<Integer>> ans,List<Integer> temp,int[] nums){
        if(set.size()==nums.length){
            ans.add(new ArrayList<Integer>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(i)){
                continue;
            }
            temp.add(nums[i]);
            set.add(i);
            main(set,ans,temp,nums);
            set.remove(i);
            temp.remove(temp.size()-1);
        }
    }
}



