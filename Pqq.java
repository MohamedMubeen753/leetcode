import java.util.Comparator;//(Maxheap) PriorityQueue
import java.util.PriorityQueue;

public class Pqq {
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add("Bankai");
        pq.add("Haki");
        pq.add("Kamehameha");
        pq.add("Dattebayo");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());
        System.out.println(pq.remove());
    }
}
