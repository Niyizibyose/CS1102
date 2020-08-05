import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
public class TrueFalseQuestion extends Question {


 TrueFalseQuestion(String question, String answer) {
	 question.setVisible(true);
	 return question.answer;
this.question = new QuestionDialog(); 
this.question.setLayout(new GridLayout(0,1));
this.question.add(new JLabel(“ "+question+"",JLabel.CENTER)); 
		JPanel buttons = new JPanel();
void addButton(JPanel buttons, String label) {
	JButton button = new JButton(label);
	button.addActionListener(question);
	buttons.add(button);
	addButton(buttons,"TRUE");
	addButton(buttons,"FALSE");
	this.question.add(buttons);
	this.question.setModal(true);
	this.question.pack();
	this.question.setLocationRelativeTo(null);

		answer = answer.toUpperCase();
 if (answer.equals("T") || answer.equals("TRUE") ||
answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
 if (answer.equals("F") || answer.equals("FALSE") ||
answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
 }
}