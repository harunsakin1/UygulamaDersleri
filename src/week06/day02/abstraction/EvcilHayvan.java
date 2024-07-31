package week06.day02.abstraction;

public abstract class EvcilHayvan {
	protected String name;
	protected Integer age;
	
	
	public abstract void makeSound();
	
	public void eat(){
		System.out.println(name+" is eating");
	}
	public void sleep(){
		System.out.println(name+" is sleeping");
	}
	
	
	public EvcilHayvan(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}