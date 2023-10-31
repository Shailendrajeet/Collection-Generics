package CollectionsTest;
import java.util.ArrayList;
import java.util.List;

public class WildcardDemo2 {
	public static void addDogs(List<? super Dog> dogs){ //Allows List<Dog>, List<Animal> and List<Object> but not List<Cat> 
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //not-ok
	}
	
	public static void addCats(List<? super Cat> cats){ //Allows List<Cat>, List<Animal> and List<Object> but not List<Dog> 
		
	}

	public static void addAnimals(List<? super Animal> animals){ //Allows List<Animal> and List<Object>
		animals.add(new Cat());//Ok
		animals.add(new Dog()); //Ok
	}
	
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence generic types are protected at compile time
		//addAnimals(dogs); //not-Ok
		addDogs(dogs);
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generic types are protected at compile time
		//addAnimals(cats); //not-Ok
		addCats(cats);
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		addDogs(animals); //Ok
		addCats(animals); //Ok
		addAnimals(animals); //Ok
	}
}
