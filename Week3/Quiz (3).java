import javax.swing.JOptionPane;

public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	static String ask(String question) {
		String answer;
		while (true) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if ((answer.equals("A")) || (answer.equals("B")) || 
					(answer.equals("C")) || (answer.equals("D")) || 
					(answer.equals("E"))) {
				return answer;
			}
			JOptionPane.showMessageDialog(null,"Invalid Answer, please enter the letter "
					+ "cooresponding to your answer."); 
		}
	}
	static void check(String question, String correctAnswer) {
		nQuestions += 1;
		String answer = ask(question);
		if (answer.equals(correctAnswer)) {
			nCorrect += 1;
			JOptionPane.showMessageDialog(null, "Congratulations, you're right! "
					+ "You win a milliondy billion dollars!\n "
					+ "...Or maybe just one point...");
		} else {
			JOptionPane.showMessageDialog(null, ("Sorry bud, the correct answer was "
					+ "in fact " + correctAnswer));
		}
	}
	public static void main(String[] args) {
		String question1 = "Who is the best cat in the whole world?\nA. Garfield\n"
				+ "B. My cat, Weebles\nC. My sister's cat, Willow\n"
				+ "D. That feral cat that lives at grandpa's house\n";
		String question2 = "What is my name?\nA. Garfield\nB. Shaun\nC. Trick question, "
				+ "peer assessment is anonymous!\nD. Mr. Shihadeh";
		String question3 = "What 90s sitcom, starring Will Smith, was known for its catchy"
				+ " rap intro?\nA. The Fresh Prince of Bel Air\nB. The Fesh Pince of Blair"
				+ "\nC. Seinfeld\nD. The Office";
		check(question1, "B");
		check(question2, "C");
		check(question3, "A");
		JOptionPane.showMessageDialog(null, ("You got " + nCorrect + " correct out of "
		+ nQuestions + " questions."));
	}

}
