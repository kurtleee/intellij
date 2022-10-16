
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < st.capacity() - 1; ++i) {
            st.push("NIHAO");
        }
        System.out.print(st.peek());
    }
}


