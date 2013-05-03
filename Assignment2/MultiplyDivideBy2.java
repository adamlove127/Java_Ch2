

import acm.program.*;


public class MultiplyDivideBy2 extends ConsoleProgram {
	public void run() {
		double baseOfTriangle = readDouble("Enter base length of triangle: ");
		double heightOfTriangle = readDouble("Enter height of triangle: ");
		double areaOfTriangle = (baseOfTriangle * heightOfTriangle) /2;
		println("The area of the triangle is "+ areaOfTriangle);
	}
	
	
	
}
