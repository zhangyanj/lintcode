public class Solution {
    /*
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
        if(A == null || A.length <= 0){
            return -1;
        }
        int bit;
        int ans = 0;
        for(int i = 0; i < 32; i++){
            bit = 0;
            for(int j = 0; j < A.length; j++){
                bit += A[j]>>i&1;
                bit %= 3;
            }
            ans |= (bit<<i);
        }
        return ans;
    }
}
