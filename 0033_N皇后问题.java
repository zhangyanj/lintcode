class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
    ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
        int[] arr=new int[n];
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        ArrayList<String> temp=new ArrayList<String>();
        main(temp,ans,n,0,arr);
        return ans;
        
    }
    void main(ArrayList<String> temp,ArrayList<ArrayList<String>> ans,int n,int i,int[] arr){
        if(temp.size()==n){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int k=0;k<n;k++){
            if(isthat(arr,i,k)){
                arr[i]=k;
                String s=pr(k,n);
                temp.add(s);
                main(temp,ans,n,i+1,arr);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
    boolean isthat(int[] arr,int k,int n){
        for(int i=0;i<k;i++){
            if(arr[i]==n||Math.abs(i-k)==Math.abs(n-arr[i])){
                return false;
            }
        }
        return true;
    }
    String pr(int n,int an){
        String s="";
        for(int i=0;i<n;i++){
            s+=".";
        }
        s+="Q";
        for(int i=n+1;i<an;i++){
            s+=".";
        }
        return s;
    }
};
