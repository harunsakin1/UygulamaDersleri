package week06.day02.abstraction;

public class Runner {
	public static void main(String[] args) {
		Cat cat1=new Cat("Bihter",1);
		Dog dog1=new Dog("Leo",4);
		
		cat1.eat();
		cat1.makeSound();
		cat1.sleep();
		cat1.playWithWoolBall();
		
		dog1.bringTheStick();
		dog1.eat();
		dog1.makeSound();
		dog1.sleep();
	}
	
}