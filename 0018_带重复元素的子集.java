import java.util.*;
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] S) {
        // write your code here
        Arrays.sort(S);
        HashSet<ArrayList<Integer>> ans=new HashSet<ArrayList<Integer>>();
        int len=S.length;
        for(int i=0;i<Math.pow(2,len);i++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            int tem=i;
            for(int j=0;j<len;j++){
                int tempint=tem&1;
                if(tempint==1){
                    temp.add(S[j]);
                }
                tem>>=1;
            }
            ans.add(temp);
        }
        return new ArrayList<ArrayList<Integer>>(ans);
    }
}

