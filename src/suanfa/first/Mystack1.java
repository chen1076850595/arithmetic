package suanfa.first;

import java.util.Stack;

/**
 * Created by chen on 2017/8/29.
 */


/**
 * 实现一个栈，加入随时获取最小值的功能
 * 实现思路：用两个栈，其中一个作为栈A，另外一个栈B保存栈中最小值
 * 每次入栈均与B栈顶元素比较大小，若不大于则同时压入B
 * 每次出栈时与栈B栈顶元素比较，若等于则B弹出一个元素
 */
public class Mystack1 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack2 ;
    public Mystack1(){
        stack  = new Stack<>();
        minStack2  = new Stack<>();
    }
    public void push(int value){
        if(minStack2.isEmpty()){
            minStack2.push(value);
        }
        else if(value <= minStack2.peek()){
            minStack2.push(value);
        }
        stack.push(value);
    }
    public int pop(){
        if(stack.isEmpty()){
            throw new RuntimeException("your stack is Empty");
        }
        if(stack.peek() == minStack2.peek()){
            minStack2.pop();
        }
       return  stack.pop();
    }
    public int getMin(){
        if(minStack2.isEmpty()){
            throw new RuntimeException("your stack is Empty");
        }
        return minStack2.peek();
    }
}
