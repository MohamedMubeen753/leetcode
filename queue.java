import java.util.ArrayDeque;
import java.util.*;

public class queue {
    public static void main(String[]args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.poll();
      int a=  queue.peek();
        System.out.println(queue);
        System.out.println(a);
    }
}
