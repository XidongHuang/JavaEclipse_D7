package tony.java;

public class testBoyGirl {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
		
		boy.setName("Tom");
		boy.setAge(23);
		
		girl.setName("Mary");
		boy.marry(girl);
		boy.shout();
		
		System.out.println();
		girl.marry(boy);
	}
}
