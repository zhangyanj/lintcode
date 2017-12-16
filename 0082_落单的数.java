public class Solution {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
        // Write your code here
        int temp=0;
        for(int i=0;i<A.length;i++){
            temp=temp^A[i];
        }
        return temp;
    }
}
