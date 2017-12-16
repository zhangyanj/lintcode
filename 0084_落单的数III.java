public class Solution {
    /*
     * @param A: An integer array
     * @return: An integer array
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        int ans = 0;
        for(int i =0 ;i<A.length; i++){
            ans = (ans^A[i]);
        }
        ans = getFirstNotZero(ans);
        List<Integer> res = new ArrayList<Integer>();
        int res1 = 0;
        int res2 = 0;
        for(int i =0; i<A.length; i++){
            if((A[i]>>ans)%2 == 0){
                res1^=A[i];
            }else{
                res2^=A[i];
            }
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
    
    public int getFirstNotZero(int A){
        int flag = 1;
        int k = 0;
        while(A%2 == 0){
            k++;
            A >>=1;
        }
        return k;
    }
}
