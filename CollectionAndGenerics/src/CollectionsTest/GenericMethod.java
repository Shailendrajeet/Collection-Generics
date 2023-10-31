package CollectionsTest;
public class GenericMethod {
	public <T> void setAnyValue(T t){
		
	}
	
	public <T extends Number> void setAnyNumber(T t){
		
	}
	
	public static void main(String[] args) {
		GenericMethod m = new GenericMethod();
		m.setAnyValue(10); //Ok
		m.setAnyValue("10"); //Ok
		
		m.setAnyNumber(10); //Ok
		m.setAnyNumber(10.0); //Ok
		//m.setAnyNumber("10"); //C.E. Type mismatch.
	}
}
