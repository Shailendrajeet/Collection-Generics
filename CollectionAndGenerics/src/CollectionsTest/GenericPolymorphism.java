package CollectionsTest;
import java.util.ArrayList;
import java.util.List;

public class GenericPolymorphism {
	public static void addAnimals(List<Animal> animals){ //List<Animal> animals = new ArrayList<Dog>();
		animals.add(new Cat());//Ok
		animals.add(new Dog()); //Ok
	}
	
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog()); //Ok
		//dogs.add(new Cat()); //Compilation error hence generic types are protected at compile time
		//addAnimals((dogs); // Not allowed
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat()); //Ok
		//cats.add(new Dog()); //Compilation error hence Generic types are protected at compile time
		//addAnimals(cats); // Not allowed
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); //Ok
		animals.add(new Cat()); //Ok
		addAnimals(animals); //allowed
	}
}
