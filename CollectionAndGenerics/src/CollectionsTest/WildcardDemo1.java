package CollectionsTest;
import java.util.ArrayList;
import java.util.List;

public class WildcardDemo1 {
	public static void readAnimals(List<? extends Animal> animals){ //List<Animal> animals = new ArrayList<Dog>();
		//animals.add(new Cat());//not-ok
		//animals.add(new Dog()); //not-ok
	}
	
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence generic types are protected at compile time
		readAnimals(dogs); //Ok
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generic types are protected at compile time
		readAnimals(cats); //Ok
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		readAnimals(animals);
	}
}
