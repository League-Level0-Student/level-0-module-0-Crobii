package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		JOptionPane.showMessageDialog(null, "QUIZ TIME!!!!");
		// 2.  Ask the user a question 
		String answer =JOptionPane.showInputDialog("What Pokemon is weak to fire, water, and grass?");
		if(answer.contentEquals("Mamoswine")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;	
		}
		// 3.  Use an if statement to check if their answer is correct
		else {
			JOptionPane.showMessageDialog(null, "wrong...");}
		// 4.  if the user's answer was correct, add one to their score 
		answer =JOptionPane.showInputDialog("What is the only Pokemon line that is poison AND flying type?");
		if(answer.contentEquals("Zubat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;	
		}
		// 3.  Use an if statement to check if their answer is correct
		else {
			JOptionPane.showMessageDialog(null, "wrong...");}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		JOptionPane.showMessageDialog (null, "Wowee! Your score was " +score );

		// After all the questions have been asked, tell the user their final score 

	}
}
