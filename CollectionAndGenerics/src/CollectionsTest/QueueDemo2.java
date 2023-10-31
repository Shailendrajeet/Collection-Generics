package CollectionsTest;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>(Collections.reverseOrder()); //sorting order and then FIFO order
		
		q.add("b");
		q.add("a");
		q.offer("d");
		q.offer("c");
		System.out.println(q.toString());

		q.remove();
		q.remove();
		q.remove();
		System.out.println(q.toString());
	}
}
