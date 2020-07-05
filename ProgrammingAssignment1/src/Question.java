import java.awt.*;
import javax.swing.*;

public abstract class Question {
    static int nQuestion = 0;
    static int nCorrect = 0;
    
    QuestionDialog question; 
    String correctAnswer;
    
    Question(String question){
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel (" " + question + " ", JLabel.CENTER));
        
    }
    
    String ask()
    {
       
     question.setVisible(true);
     return question.answer;
        
    }
    
    void check(){
        nQuestion += 1;
        String answer = ask();
        if (answer.equals(correctAnswer)){
            nCorrect += 1;
            JOptionPane.showMessageDialog(null, "Well done! \n" + answer + " is the correct answer");
        }
        else{
            JOptionPane.showMessageDialog(null, answer + " is INCORRECT \nThe correct answer is " + correctAnswer);
        }
    }
    
    static void showResults(){
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestion + " questions");
    }
    
    void initQuestionDialog(){
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
}