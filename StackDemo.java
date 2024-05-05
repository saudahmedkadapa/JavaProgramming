import java.util.*;

public class StackDemo {
    static void showpush(Stack<Integer> st, int b) {
        st.push(b);
        System.out.println("push(" + b + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer b = st.pop();
        System.out.println(b);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
