/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Phytagorean theorem");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double asqr = a*a;
		double bsqr = b*b;
		println();
		println(asqr);
		println(bsqr);
		double addition = asqr + bsqr;
		println(addition);
		println();
		double pythag = Math.sqrt(addition);
		println("C = " + pythag);
		
		
		/* You fill this in */
	}
}
