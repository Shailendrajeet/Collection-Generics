package CollectionsTest;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		
		s.pop();
		s.pop();
		System.out.println(s);
	}
}
