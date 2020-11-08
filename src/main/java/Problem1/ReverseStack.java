package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
        if(stack.size() > 0){
            int a = stack.peek();
            stack.pop();
            reverseStack(stack);
            insert(stack, a);
        }
    }
    //help
    public static void insert(Stack<Integer> stack, int a){
        if(stack.isEmpty()){
            stack.push(a);
        }
        else{
            int b = stack.peek();
            stack.pop();
            insert(stack, a);
            stack.push(b);
        }
    }
}