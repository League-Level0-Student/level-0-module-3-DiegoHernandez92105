
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer;
	answer = JOptionPane.showInputDialog(null, "WHtich birthday (DAD,MOM.MY");
	
		// 3. Print out what the user typed
	System.out.println(answer);	
		// 4. if user asked for "mom"
	if(answer.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
if(answer.equalsIgnoreCase("Dad")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
	}
if(answer.equalsIgnoreCase("my")) {
	JOptionPane.showMessageDialog(null, myBirthday);
}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
