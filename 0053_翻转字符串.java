public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        s=s.trim();
        if(s.length() == 0){
            return "";
        }
        Stack<Character> stack = new Stack<Character>();
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            ans = ans+String.valueOf(stack.pop());
        }
        return work(ans);
        
    }
    
    
    
    public String work(String s) {
        // write your code here
        if(s.length() == 0){
            return "";
        }
        Stack<Character> stack = new Stack<Character>();
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                stack.push(s.charAt(i));
            }else{
                while(!stack.isEmpty()){
                   ans = ans+String.valueOf(stack.pop());
                }
                ans =ans +" ";
            }
        }
        while(!stack.isEmpty()){
            ans = ans+String.valueOf(stack.pop());
        }
        return ans;
        
    }
    
}
