import java.util.Stack;

/**
 * Created by machenike on 2017/7/3 0003.
 */
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if(stack.empty()){
            return -1;
        }else{
            int min = stack.peek();
            int p;
            while(!stack.empty()){
                p = stack.pop();
                stack2.push(p);
                if(p<min){
                    min = p;
                }
            }
            while(!stack2.isEmpty()){
                stack.push(stack2.pop());
            }
            return min;
        }
    }

}
