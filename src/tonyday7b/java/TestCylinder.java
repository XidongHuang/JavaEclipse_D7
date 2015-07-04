package tonyday7b.java;
import tonyday7b.exe.Cylinder;


public class TestCylinder {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(2.6);
		cylinder.setLength(1.8);
		System.out.println("The cylinder's base area is "+ cylinder.findArea()+" , and its volume is " + cylinder.findVolume());
		
	}
}
