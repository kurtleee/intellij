import java.util.Deque;
import java.util.LinkedList;

interface inter {
    int evalRPN(String[] tokens);

    boolean isNumber(String token);

}


public class RPN implements inter{
    public static void main(String[] args) {
        String[] tokens = new String[]{"1", "3", "+"};
        RPN o1  = new RPN();
        System.out.print(o1.evalRPN(tokens));
    }

    public int evalRPN (String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int t2 = stack.pop();
                int t1 = stack.pop();
                switch (token) {
                    case "+" -> stack.push(t1 + t2);
                    case "-" -> stack.push(t1 - t2);
                    case "*" -> stack.push(t1 * t2);
                    case "/" -> stack.push(t1 / t2);
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("-".equals(token) || "+".equals(token) || "*".equals(token) || "/".equals(token));
    }
}
