package CollectionsTest;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class Employee {
	private int eno;
	private String ename;

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public Integer getEno() {
		return this.eno;
	}

	public String getEname() {
		return ename;
	}

	@Override
	public String toString() {
		return this.eno + " " + this.ename;
	}
}

// sort employees based on number
class EnoSort implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEno().compareTo(e2.getEno());
	}
}

// sort employees based on name
class EnameSort implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEname().compareTo(e2.getEname());
	}
}

public class SortDemo3 {
	public static void main(String[] args) {
		List<Employee> emps = new Vector<Employee>();

		emps.add(new Employee(2, "abc"));
		emps.add(new Employee(1, "xyz"));
		emps.add(new Employee(3, "pqr"));
		System.out.println(emps.toString());

		//Collections.sort(emps, new EnoSort()); // Customized Sorting Order
		emps.sort(new EnoSort()); // Customized Sorting Order
		System.out.println(emps.toString());
		
		//Collections.sort(emps, new EnameSort()); // Customized Sorting Order
		emps.sort(new EnameSort()); // Customized Sorting Order
		System.out.println(emps.toString());

	}
}
