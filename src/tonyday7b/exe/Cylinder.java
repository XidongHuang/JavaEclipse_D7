package tonyday7b.exe;

public class Cylinder extends Circle{
	private double length;
	
	public Cylinder(){
		this.length= 1;
	}
	
	public Cylinder(double length){
		this();
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double findVolume(){
		return this.findArea()*this.length;
	}
	
	public double findArea(){
		return Math.PI * this.length;
	}
}
