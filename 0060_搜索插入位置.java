public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int fir=0;
        int last=A.length-1;
        while(fir<last){
            int mid=(fir+last);
            if(A[mid]==target){
                return mid;
            }
            else if(A[mid]>target){
                last=mid-1;
            }else{
                fir=mid+1;
            }
        }
        return fir;
    }
}

