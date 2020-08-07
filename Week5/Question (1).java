import javax.swing.JOptionPane;

public abstract class Question {
	 abstract String ask();
	
	static int nQuestions = 0; 
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	void check() {

		nQuestions++;

		String answer = ask();

		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");

			nCorrect++;

		}
		else {

			JOptionPane.showMessageDialog(null, "Incorrect!, Correct answer is "+correctAnswer);
		}
	}
	
	

	



	static void showResults() {
		 JOptionPane.showMessageDialog(null, nCorrect + " Correct out of "+nQuestions);	
		 
	 }		
}
