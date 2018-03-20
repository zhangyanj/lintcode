c class Solution {
    /**
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < len; i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int fir = Integer.valueOf(stack.pop());
                int sec = Integer.valueOf(stack.pop());
                int ans = 0;
                if(tokens[i].equals("+")){
                    ans = fir+sec;
                }
                else if(tokens[i].equals("-")){
                    ans = sec-fir;
                }
                else if(tokens[i].equals("*")){
                    ans = fir*sec;
                }
                else if(tokens[i].equals("/")){
                    ans = sec/fir;
                }
                stack.push((int)ans);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
