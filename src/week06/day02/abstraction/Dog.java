package week06.day02.abstraction;

public class Dog extends EvcilHayvan{
	public Dog(String name, Integer age) {
		super(name, age);
	}
	
	public void bringTheStick(){
		System.out.println(name+" is bringing the stick");
	}

	@Override
	public void makeSound() {
		System.out.println(name+" barking");
	}
	
	
}