class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int fir=0;
        int last=A.length-1;
        while(fir<last){
            int mid=(fir+last)/2;
            if(A[mid]>A[mid-1]&&A[mid]>A[mid+1]){
                return mid;
            }else if(A[mid]<A[mid-1]){
                last=mid;
            }else{
                fir=mid;
            }
        }
        return 0;
        
    }

}

