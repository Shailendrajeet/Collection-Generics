package CollectionsTest;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SortDemo1 {
	public static void main(String[] args) {
		List<String> fruits = new Vector<String>();
		
		fruits.add("Grapes");
		fruits.add("Apples");
		fruits.add("Pea");
		fruits.add("Banana");
		fruits.add("Kiwi");
		System.out.println(fruits);
		
		//Collections.sort(fruits);//Natural Sorting Order
		fruits.sort(null); //Natural Sorting Order
		System.out.println(fruits);
		
		

	}
}
