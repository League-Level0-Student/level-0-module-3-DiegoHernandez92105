//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String answer;
		//1. ask the user if they like bananas
		//2. if they say no, 
		answer = JOptionPane.showInputDialog(null, "Do you like bananas");
			//tell them they are crazy 
		if (answer.equalsIgnoreCase("Yes")) {
		
			JOptionPane.showMessageDialog(null, "What is your favorite hobby?");
			}
		if (answer.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		//	show a pop up that says "<your hobby> is much better with bananas!"
			
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
}
