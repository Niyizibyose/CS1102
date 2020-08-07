
public class Quiz {
	
	
	public static void main(String[] args ) {
		
		Question question = new MultipleChoiceQuestion(
		"Which country is the largest landlocked in the world by size?","Kazakhstan",
		"Kyrgyzstan",
		"Lesotho",
		"Ethiopia",
		"Vatican City", "A");		
		Question question2=new MultipleChoiceQuestion(
		"How far is the international space station from earth?",
		"3422 miles",
		"1067 miles",
		"254 miles",
		"500 miles",
		"7800 miles", "C");
		Question question3 = new MultipleChoiceQuestion(
		"Who is the first devloper of Java?",
		"Bjarne Stroustrup",
		"Bill Gates",
		"Ryan Gosling",
		"James Gosling",
		"Mark Zuckerberg","D");
		Question question4 = new MultipleChoiceQuestion(
		"Which city is the host of the next Summer Olympics?",
		"Los Angeles",
		"Tokyo",
		"Moscow",
		"Paris",
		"Rio de Janeiro", "B");
		Question question5 = new MultipleChoiceQuestion(
		"What is the most spoken language in the world?",
		"Portuguese",
		"French",
		"English",
		"Spanish",
		"Mandarin Chinese", "E");
		Question question6 = new TrueFalseQuestion(
		"COVID-19 does not affect kids.", "FALSE");
		
		Question question7 = new TrueFalseQuestion(
		"A heptagon has eight sides.", "FALSE");
		
		Question question8 = new TrueFalseQuestion(
		"Cyclones spin in a clockwise direction in the southern hemisphere.", "TRUE");
		
		Question question9 = new TrueFalseQuestion(
		"A metre is further than a yard.", "TRUE");
		
		Question question10 = new TrueFalseQuestion(
		"Flying in an aeroplane is statistically safer than driving in a car", "TRUE");


		question.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		question7.check();
		question8.check();
		question9.check();
		question10.check();

		
		Question.showResults();
							
	}
	
}
