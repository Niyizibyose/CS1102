import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
	TrueFalseQuestion(String question, String answer) {
		this.question = "TRUE or FALSE: " +question;
		
		correctAnswer=answer.toUpperCase();
	}


	@Override
	String ask() {
		
		
		String answer;
		
		
		
		while((answer = JOptionPane.showInputDialog(question))!=null) {
			answer = answer.toUpperCase();
			System.out.print(answer);
				
			if (answer.equals("f")||answer.equals("false") || answer.equals("FALSE") || 
				answer.equals("F") ||answer.equals("n") || answer.equals("no") || 
				answer.equals("N") ||answer.equals("NO")||answer.equals("No") || 
				answer.equals("t") || answer.equals("T") || answer.equals("true") ||
				answer.equals("TRUE")||answer.equals("True") || answer.equals("y") || 
				answer.equals("Y") || answer.equals("yes") ||
				answer.equals("Yes") || answer.equals("YES")) {				
				return answer.toUpperCase();
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
				
			}
		}
		
		return question;	
	
	

		// TODO Auto-generated method stub
		
}
	}


