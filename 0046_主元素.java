public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int mainint=nums.get(0);
        int maincount=1;
        for(int i=1;i<nums.size();i++){
            if(maincount==0){
                mainint=nums.get(i);
            }
             if(nums.get(i)==mainint){
                 maincount++;
             }else{
                 maincount--;
             }
        }
        return mainint;
    }
}
