package day1.robot;
import java.awt.Color;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotWindow;


public class FeedTheRobot implements KeyEventDispatcher
{
	Robot geff = new Robot();
	Robot geff2 = new Robot();
	private void feedTheRobot()
	{
		geff2.penDown();
		geff.penDown();
		geff2.setPenColor(Color.ORANGE);
		geff.setPenColor(Color.magenta);
		geff2.penUp();
		geff2.moveTo(500, 500);
		geff2.penDown();
		// 1. use the addFood() method to add food for the robot
	}

private void goUp()
	{
		// 2. Print "going up". Test it out by running your code and pressing the up key
	System.out.println("going up");
		// 3. Make the robot move up the screen
	geff.move(50);
	}

	private void goDown()
	{
		// 4. make the robot move down the screen
		
		geff.move(-50);
	}
	
	private void goLeft()
	{
		// 5. make the robot move left
	geff.turn(-10);
	}

	private void goRight()
	{
		// 6. make the robot move right
	geff.turn(10);
	}


	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
		
	}

	RobotWindow window = geff.getWindow();
	Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheRobot feeder = new FeedTheRobot();
		feeder.controlTheRobot();
		feeder.feedTheRobot();
	}

	private void controlTheRobot() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		geff.show();
		geff.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			if (e.getKeyCode() == KeyEvent.VK_D)
				geff2.turn(10);
			if(e.getKeyCode() == KeyEvent.VK_A)
				geff2.turn(-10);
			if(e.getKeyCode() == KeyEvent.VK_W)
				geff2.move(50);
			if(e.getKeyCode() == KeyEvent.VK_S)
				geff2.move(-50);
		}
		return false;
	}

}

