public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if(A==null||A.length==0){
            return -1;
        }
        int firsttarget=A[0];
        int lasttarget=A[A.length-1];
        int start=0;
        int end=A.length-1;
        int mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(A[mid]==target){
                return mid;
            }
            if(A[mid]>A[start]){
                if(target>=A[start]&&target<A[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(A[mid]<A[end]){
                if(target<=A[end]&&target>A[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                } 
            }

        }
        if(A[mid]==target){
            return mid;
        }if(A[start]==target){
            return start;
        }if(A[end]==target){
            return end;
        }
        return -1;
    }
}

