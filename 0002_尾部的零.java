class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if(n<=0){
            return 0;
        }
        long count=0;
        long temp=5;
        while(temp<=n){
            count+=(long)n/temp;
            temp*=5;
        }
        return count;
    }
};

