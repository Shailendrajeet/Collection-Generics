package CollectionsTest;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class Student implements Comparable<Student>{
	private int sno;
	private String sname;
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public int compareTo(Student s){
		/*if(this.sno<s.sno){
			return -1;
		}else if(this.sno>s.sno){
			return +1;
		}else{
			return 0;
		}*/
		
		/*Integer iRef1 = this.sno;
		Integer iRef2 = s.sno;
		return iRef1.compareTo(iRef2);*/
		
		String str1 = this.sname;
		String str2 = s.sname;
		return str1.compareTo(str2);
	}
	
	@Override
	public String toString(){
		return this.sno+"  "+this.sname;
	}
}

public class SortDemo2 {
	public static void main(String[] args) {
		List<Student> students = new Vector<Student>();
		
		students.add(new Student(2, "abc"));
		students.add(new Student(1, "xyz"));
		students.add(new Student(3, "pqr"));
		System.out.println(students.toString());
		
		//Collections.sort(students);  //Natural Sorting Order
		students.sort(null); ////Natural Sorting Order
		System.out.println(students.toString());
	}
}
