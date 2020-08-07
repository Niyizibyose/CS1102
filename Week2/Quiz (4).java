
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "Which country is the largest landlocked in the world by size?\n";
		
		question += "A. Kazakhstan\n";
		question += "B. Kyrgyzstan\n";
		question += "C. Lesotho\n";
		question += "D. Vatican City\n";
		//String answer = JOptionPane.showInputDialog(question);		


		String answer = "";
		
		
		
	while((answer = JOptionPane.showInputDialog(question))!=null) {
		
		System.out.print(answer);
		answer = answer.toUpperCase();
		
		if (answer.equals("A")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			break;
		} else if (answer.equals("B") || answer.equals("C") || answer.equals("D")) {
			JOptionPane.showMessageDialog(null, "Incorrect Please try again!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Invalid answer Please try again!");
			
		}	
			
		}
		
	}

}
