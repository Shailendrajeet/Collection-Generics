package CollectionsTest;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo {
	public static void main(String[] args) {
		//Vector<String> names = new Vector<String>();
		//List<String> names = new ArrayList<String>();
		List<String> names = new LinkedList<String>();
		
		names.add("Swaroop");
		names.add("Amit");
		names.add("Geetha");
		names.add("Faiz");
		names.add("Swetha");
		names.add("Sanket");
		names.add("Sanket");
		System.out.println(names.toString());
		
		//Approach #1: Using Enumeration interface
		/*Enumeration<String> e = names.elements();
		while(e.hasMoreElements()){
			String name = e.nextElement();
			System.out.print(name+"  ");
		}
		System.out.println();*/
		
		//Approach #2: Using Iterator interface
		Iterator<String> ittr = names.iterator();
		while(ittr.hasNext()){
			String name = ittr.next();
			System.out.print(name+"  ");
			if(name.equals("Sanket")){
				ittr.remove();
			}
		}
		System.out.println();
		System.out.println(names.toString());
		
		//Approach #3: Using ListIterator interface
		ListIterator<String> littr = names.listIterator();
		while(littr.hasNext()){
			String name = littr.next();
			System.out.print(name+"  ");
			if(!name.equals("Sanket")){ //does not exist
				littr.add("Sanket");
				//names.add("Sanket");
			}
		}
		//littr.add("Sanket");
		//names.add("Sanket");
		System.out.println();	
		System.out.println(names.toString());
		
		//Approach #4: Using Enhanced for loop
		for(String name : names){
			System.out.print(name+"  ");
		}
		System.out.println();
		
		//Approach #5: Using forEach() method in Java 8 and Anonymous inner class
		names.forEach(new Consumer<String>(){
			@Override
			public void accept(String name){
				System.out.print(name+"  ");
			}
		  }
		);
		System.out.println();
		
		//Approach #6: Using forEach() method and Lambda expressions in Java 8
		names.forEach(name -> System.out.print(name + "  "));
		System.out.println();
		
		//Approach #7: Using forEach() and Method Reference in Java 8
		names.forEach(System.out::println);
	}
}
