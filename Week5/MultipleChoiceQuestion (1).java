import javax.swing.JOptionPane;
class MultipleChoiceQuestion extends Question{
	 
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question= query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";

		correctAnswer=answer.toUpperCase();
		
	}
		 String ask() {
			
			String answer;
			
			while((answer = JOptionPane.showInputDialog(question))!=null) {
				
				
				System.out.print(answer);
				answer = answer.toUpperCase();
				
				
				if (answer.equals("A")||answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
					return answer.toUpperCase();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E");
					
				}
			}
			
			return question;	
		
			}
			
			
			static void showResults() {
			 JOptionPane.showMessageDialog(null, nCorrect + " Correct out of "+nQuestions);	
			 
		 }		
	}


