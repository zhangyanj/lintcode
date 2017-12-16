import java.util.*;
public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        long temp;
        ArrayList<Long> ans=new ArrayList<Long>();
        for(int i=0;i<A.size();i++){
            temp=1;
            for(int j=0;j<A.size();j++){
                if(i!=j){
                    temp*=A.get(j);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}

