class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if(source==null||target==null){
            return -1;
        }
        int biglen=source.length();
        int smalllen=target.length();
        for(int i=0;i<=biglen-smalllen;i++){
            int tempi=i;
            int j;
            for(j=0;j<smalllen;j++){
                if(source.charAt(i)==target.charAt(j)){
                    i++;
                }else{
                    i=tempi;
                    break;
                }
            }
            if(j==smalllen){
                return tempi;
            }
            
        }
        return -1;
    }
}
