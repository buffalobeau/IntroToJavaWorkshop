package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot geff=new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
geff.setSpeed(31999);
		// 5. Set the pen width to 5
geff.setPenWidth(5);
geff.penDown();
		// 6. Do steps #6 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	geff.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
geff.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			
		
		geff.move(200);
		geff.turn(90);
		}
		JOptionPane.showMessageDialog(null, "i like fish");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
