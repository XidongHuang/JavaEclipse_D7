package tony.java;

public class Boy {
	private String name;
	private int age;
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
	
	public void marry(Girl girl){
		System.out.println("I will get marry with " + girl.getName());
	}
	
	public void shout(){
		if(age >= 22){
			System.out.println("I can get marry!");
		} else {
			System.out.println("Just have girl friend");
		}
	}
	

}
