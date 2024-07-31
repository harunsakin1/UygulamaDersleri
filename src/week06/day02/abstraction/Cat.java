package week06.day02.abstraction;

public class Cat extends EvcilHayvan{
	
	public Cat(String name, Integer age) {
		super(name, age);
	}
	
	
	public void playWithWoolBall(){
		System.out.println(name+" playing with woolball");
	}

	@Override
	public void makeSound() {
		System.out.println(name+"is meowing");
	}
	
}