public class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MinStack() {
        // do initialize if necessary
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        if(stack2.isEmpty()){
            stack1.push(number);
            stack2.push(number);
        }else{
            if(number<stack2.peek()){
                stack1.push(number);
                stack2.push(number);
            }else{
                stack1.push(number);
                stack2.push(stack2.peek());
            }
        }
    }

    public int pop() {
        // write your code here
        stack2.pop();
        return stack1.pop();
        
    }

    public int min() {
        // write your code here
        return stack2.peek();
    }
}

