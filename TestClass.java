import java.util.Comparator;
import java.util.PriorityQueue;

public class TestClass {
    public static void main(String[] args) {
        // 创建一个字符串优先队列，按字符串长度排序
        PriorityQueue<String> pq = new PriorityQueue<>();

        // 向队列中添加元素
        pq.offer("apple");
        pq.offer("banana");
        pq.offer("orange");
        pq.offer("pear");

        // 输出队列中的元素
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
