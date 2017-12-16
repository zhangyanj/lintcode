public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int m=0;//hang
        if(matrix==null||matrix.length==0){
            return false;
        }
        int len=matrix.length-1;
        int n=matrix[0].length-1;//åˆ—
        while(m<=len&&n>=0){
            if(matrix[m][n]>target){
                n--;
            }else if(matrix[m][n]<target){
                m++;
            }else{
                return true;
            }
        }
        return false;
    }
}

