package tony.java;

public class Girl {
	private String name;
	
	public Girl(){
		
	}
	
	public void setName(String i){
		this.name = i;
	}
	public String getName(){
		return name;
	}
	
	public void marry(Boy boy){
		
		System.out.println("I will get marry with "+ boy.getName());
		boy.marry(this);
	}
}
