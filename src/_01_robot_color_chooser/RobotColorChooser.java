//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;
public class RobotColorChooser {
	
	public static void main(String[] args) {
		String color = null;
		//1. Create a new Robot
		Robot bot = new Robot();


		//3. Ask the user what color they would like the robot to draw
		for(int i = 0; i<4; i++) {
		color = JOptionPane.showInputDialog(null, "What color do you want (Red,Green,Blue)");		
		//5. Use an if/else statement to set the pen color that the user requestedif(color.equalsIgnoreCase ("Red") ) {
		}
		bot.setPenColor(255, 0, 0);
	int random = 0;
	Random ran = new Random();
	random = ran.nextInt(3 - 1);
if(color.equalsIgnoreCase("Red"))	{
	bot.setPenColor(255,0,0);
}
 if(color.equalsIgnoreCase("Green")) {
	bot.setPenColor(0,255,0);
}
else if(color.equalsIgnoreCase("Blue")) {
	bot.setPenColor(0,0,255);
}
else {
	if(random == 1) {
		bot.setPenColor(255, 0, 0);
	}
	if(random == 2) {
		bot.setPenColor(0, 255, 0);
	}
	if(random == 3) {
		bot.setPenColor(0, 0, 255);
	}

}

        //6. If the user doesn’t enter anything, choose a random color
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	bot.setPenWidth(10);
	bot.penDown();
	bot.setSpeed(100);
	    //2. Make the robot draw a shape (this will take more than one line of code)
	for(int i = 0; i<4; i++) {
		
		
	bot.move(90);
	bot.turn(90);
	}
}
	}
	

