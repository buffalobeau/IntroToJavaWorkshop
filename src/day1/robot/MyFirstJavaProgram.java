package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

Robot geff=new Robot();	
geff.setPenColor(Color.magenta);
geff.penDown();
for (int i = 0; i < 4; i++) {
geff.move(300);
geff.turn(90);
}
geff.move(50);
for (int i = 0; i < 4; i++) {
	geff.move(300);
	geff.turn(90);
}
	}
}
