import java.util.Stack;

/**
 * Created by machenike on 2017/7/3 0003.
 */
public class Main {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        MinStack minStack = new MinStack();
        minStack.push(3);
        System.out.println(minStack.min());
        minStack.push(4);
        System.out.println(minStack.min());
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(3);
        System.out.println(minStack.min());
        System.out.println(minStack.stack.size());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.push(0);
        System.out.println(minStack.min());
    }
}
