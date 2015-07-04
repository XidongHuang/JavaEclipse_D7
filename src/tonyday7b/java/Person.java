package tonyday7b.java;

public class Person {
	private int age;
	private String name;
	
	public Person() {
		
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(){
		System.out.println("Eat");
	}
	
	public void walk(){
		System.out.println("Walk");
	}
	
	
	
}
