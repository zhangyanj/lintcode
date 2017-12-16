public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        String ans="";
        if(strs==null||strs.length==0){
            return ans;
        }
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(minlen>strs[i].length()){
                minlen=strs[i].length();
            }
        }

        for(int i=0;i<minlen;i++){
            char temp=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=temp){
                    return ans;
                }
            }
            ans+=strs[0].charAt(i);
        }
        return ans;
    }
}
