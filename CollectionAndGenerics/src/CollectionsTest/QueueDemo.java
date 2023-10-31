package CollectionsTest;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>(); //FIFO order
		
		q.add("a");
		q.add("b");
		q.offer("c");
		q.offer("d");
		System.out.println(q.toString());

		q.remove();
		q.poll();
		System.out.println(q.toString());
		
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.toString());
	}
}
