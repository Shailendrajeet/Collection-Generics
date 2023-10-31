package CollectionsTest;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class RevSort implements Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2){
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		return str2.compareTo(str1);
	}
} 

public class SortDemo4 {
	public static void main(String[] args) {
		List<StringBuffer> names = new Vector<StringBuffer>();
		
		names.add(new StringBuffer("pqr"));
		names.add(new StringBuffer("abc"));
		names.add(new StringBuffer("xyz"));
		System.out.println(names.toString());

		//Collections.sort(names, new RevSort());
		names.sort(new RevSort());
		System.out.println(names.toString());
	}
}
