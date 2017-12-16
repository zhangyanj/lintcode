class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here
        HashSet<Integer> set=new HashSet<Integer>();
        HashSet<List<Integer>> ans=new HashSet<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        main(set,ans,temp,nums);
        return new ArrayList<List<Integer>>(ans);
    } 
    
    void main(HashSet<Integer> set,HashSet<List<Integer>> ans,List<Integer> temp,int[] nums){
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



