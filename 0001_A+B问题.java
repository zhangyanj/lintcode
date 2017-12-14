public class Solution {
    /*
     * @param : An integer
     * @param : An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int sum;
        int carry;
        while(b != 0){
            sum = a ^ b;
            carry = (a&b)<<1;
            a = sum;
            b = carry;
        }
        return a;
    }
};
