/*
 * File: DrawRobot.java
 * --------------------
 * This program draws a simple robot diagram in the window.  Its
 * programming style leaves much to be desired, mostly because
 * the coordinate values are specified explicitly and not defined
 * so that they automatically adjust according to specified
 * parameters of the image as a whole.  You will learn how to
 * improve the style in Chapter 7.
 */
import acm.graphics.*;
import acm.program.*;

public class Snowman extends GraphicsProgram {
   public void run() {
	   add(new GOval(350, 100, 40, 40));
	   add(new GOval(330, 140, 80, 80));
	   add(new GOval(290, 220, 160, 160));
	   add(new GRect(365, 150, 10, 10));
	   add(new GRect(365, 175, 10, 10));
	   add(new GRect(365, 200, 10, 10));
	   add(new GOval (363, 130, 15, 5));
	   add(new GOval (355, 110, 9, 7));
	   add(new GOval (375, 110, 9, 7));
	   add(new GLabel("v"), 368,126);
	   add(new GLabel("."), 378,115);
	   add(new GLabel("."), 358,115);

	   
} }