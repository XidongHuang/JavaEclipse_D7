package tonyday7b.exe;

public class Kids extends ManKind{
	private int yearsOld;
	
	public Kids(){
		
	}
	
	public Kids(int yearOld){
		this.yearsOld = yearOld;
	}
	
	public void printAge(){
		System.out.println("The kid is " + this.getYearsOld()+" years old.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public static void main(String[] args) {
		Kids someKid =  new Kids(8);
		
		someKid.setSex(1);
		someKid.setSalary(0);
		
		someKid.manOrWoman();
		someKid.employeed();
		someKid.printAge();
	}

}
