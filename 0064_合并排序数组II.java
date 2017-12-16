class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int alllen=m+n;
        while(m>0&&n>0){
            if(A[m-1]>B[n-1]){
                A[alllen-1]=A[m-1];
                alllen--;
                m--;
            }else{
                A[alllen-1]=B[n-1];
                alllen--;
                n--;
            }
        }
        while(m>0){
            A[alllen-1]=A[m-1];
            alllen--;
            m--;
        }
        while(n>0){
            A[alllen-1]=B[n-1];
            alllen--;
            n--; 
        }
    }

}
