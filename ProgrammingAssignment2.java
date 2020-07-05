import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		String question = "Who is the best cat in the whole world?\n";
		question += "A. Garfield\n";
		question += "B. My cat, Weebles\n";
		question += "C. My sister's cat, Willow\n";
		question += "D. That feral cat that lives at grandpa's house\n";
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("A") || answer.equals("GARFIELD")) {
				JOptionPane.showMessageDialog(null,"Incorrect. Garfield is worthless; he's only good when he's driving a go-kart."); 
			} else if (answer.equals("B") || answer.equals("WEEBLES")) {
				JOptionPane.showMessageDialog(null,"Yes! Weebles is the sweetest boy in the world :)");
				break;
			} else if (answer.equals("C") || answer.equals("WILLOW")) {
				JOptionPane.showMessageDialog(null,"Not quite. Willow is soft and nice but not the best cat in the world. Maybe second best."); 
			} else if (answer.equals("D") || answer.equals("FERAL")) {
				JOptionPane.showMessageDialog(null,"What? No! Get out of here."); 
			} else {
				JOptionPane.showMessageDialog(null,"Invalid Answer, please try again."); 
			}
		}
		JOptionPane.showMessageDialog(null,"Congratulations, you found the right answer. You win a million dollars!"); 
	}

}
