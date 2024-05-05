import java.util.Stack;  

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();  
        stk .push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk);
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk);
     
    }
    
}
