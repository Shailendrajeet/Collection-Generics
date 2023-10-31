package CollectionsTest;
public class NonGenericClass {
	private String value;
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public static void main(String[] args) {
		NonGenericClass obj = new NonGenericClass();
		obj.setValue("ten"); //Ok
		//obj.setValue(10); //not-ok
	}
}
