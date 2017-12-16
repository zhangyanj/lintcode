public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-2;i++){
            int first=i+1;
            int last=numbers.length-1;
            while(first<last){
                int temp=numbers[i]+numbers[first]+numbers[last];
                if(temp>0){
                    last--;
                }else if(temp<0){
                    first++;
                }else{
                    ArrayList<Integer> tempans=new ArrayList<Integer>();
                    tempans.add(numbers[i]);
                    tempans.add(numbers[first]);
                    tempans.add(numbers[last]);
                    if(!ans.contains(tempans)){
                        ans.add(tempans); 
                    }

                    first++;
                }
            }
        }
        return ans;
    }
}
