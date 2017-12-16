public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        //0到m与0到n的最长公共子串   
        char[] arr1=A.toCharArray();
        char[] arr2=B.toCharArray();
        int max=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(longest(arr1,arr2,i,j)>max){
                    max=longest(arr1,arr2,i,j);
                }
            }
        }
        return max;
    }
    
    public int longest(char[] a,char[] b,int m,int n){
        int len1=a.length;
        int len2=b.length;
        int len=Math.min(len1-m,len2-n);
        int le;
        for(le=0;le<len;m++,n++,le++){
            if(a[m]!=b[n]){
                break;
            }
        }
        return le;
    }
}
