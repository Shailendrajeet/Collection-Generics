package CollectionsTest;
public class GenericClass<T> {
	private T value;
	public void setValue(T value){
		this.value = value;
	}
	
	public T getValue(){
		return this.value;
	}
	
	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<String>();
		obj.setValue("ten"); //Ok
		
		GenericClass<Integer> obj2 = new GenericClass<Integer>();
		obj2.setValue(10); //ok
	}
}
