import javax.swing.JOptionPane;
public class MultipleChoiceQuestion extends Question {
 MultipleChoiceQuestion(String query, String a, String b, String c,
String d, String e, String answer) {
 question = query+"\n";
 question += "A. "+a+"\n";
 question += "B. "+b+"\n";
 question += "C. "+c+"\n";
 question += "D. "+d+"\n";
 question += "E. "+e+"\n";
 correctAnswer = answer.toUpperCase();
 }
 String ask() {
 while (true) {
 String answer = JOptionPane.showInputDialog(question);
 answer = answer.toUpperCase();
 boolean valid = (answer.equals("A") || answer.equals("B")
|| answer.equals("C") || answer.equals("D") || answer.equals("E"));
 if (valid) return answer;
 JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
 }
 
 void addChoice(String name, String label) {
	 addChoice("A",a);
	 addChoice("B",b);
	 addChoice("C",c);
	 addChoice("D",d);
	 addChoice("E",e);
	 initQuestionDialog();
	 JPanel choice = new JPanel(new BorderLayout());
	 JPanel choice = new JPanel(new BorderLayout());
	 JButton button = new JButton(name);
	 button.addActionListener(question);
	 choice.add(button,BorderLayout.WEST);
	 choice.add(new JLabel(label+"",JLabel.LEFT),BorderLayout.CENTER);
	 question.add(choice);
 }
	 {
 
}
}
 }