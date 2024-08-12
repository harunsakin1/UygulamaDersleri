package deneme.footballManager;

public class Player {
	private String name;
	private int age;
	private String position;
	private int skillLevel; // 0-100 arasýnda bir deðer
	private int value;
	
	public Player(String name, int age, String position, int skillLevel, int value) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.skillLevel = skillLevel;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSkillLevel() {
		return skillLevel;
	}
	
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// Getters and setters
	// toString methodu oyuncunun özelliklerini yazdýrmak için
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Position: " + position +
				", Skill Level: " + skillLevel + ", Value: $" + value;
	}
}