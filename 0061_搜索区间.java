public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] ans={-1,-1};
        if(A==null||A.length==0){
            return ans;
        }
        if(A[0]>target||A[A.length-1]<target){
            return ans;
        }
        int start=0;
        int end=A.length-1;
        int left=0;
        while(start<=end){
            //if(start==end){
            //    left=end;;
            //}
            int mid=(start+end)/2;
            if(A[mid]>=target){
                end=mid-1;//find left binajie,so when >= ï¼Œleftmove
            }else{
                start=mid+1;
            }
        }
        left=end+1;
        
        start=0;
        end=A.length-1;
        int right=0;
        
        while(start<=end){
            //if(start==end){
            //    right=end;;
            //}
            int mid=(start+end)/2;
            if(A[mid]<=target){
                start=mid+1;//find left binajie,so when >= ï¼Œleftmove
            }else{
                end=mid-1;
            }
        }
        right=start-1;
        if(A[left]!=target&&A[right]!=target){
            return ans;
        }
        ans[0]=left;
        ans[1]=right;
        return ans;
    }
}

