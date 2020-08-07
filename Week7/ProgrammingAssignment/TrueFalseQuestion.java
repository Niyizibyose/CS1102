package Unit2;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TrueFalseQuestion extends Question {

	public TrueFalseQuestion(String question, String answer) {
		super(question);
		
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		
		this.question.add(buttons);
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
		
		answer = answer.toUpperCase();
		
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
			this.correctAnswer = "TRUE";
		} else {
			this.correctAnswer = "FALSE";
		}
	}

	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}	
}
