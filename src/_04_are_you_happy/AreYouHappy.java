package _04_are_you_happy;
import javax.swing.JOptionPane;
public class AreYouHappy {
	public static void main(String[] args) {
		String answer;
		String answer1;
		answer = JOptionPane.showInputDialog(null, "Are you happy?");
		if(answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing then!");
			
		}
		else if(answer.equalsIgnoreCase("no")) {
			answer1 = JOptionPane.showInputDialog(null, "do you want to be happy?");
		if(answer1.equalsIgnoreCase("no"));{
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing then");
		}
			 if (answer1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "CHANGE SOMETHINEG ");
			}
		}
		
		}
		
	}
	

