package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) { 

		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you know how to write code?");
		if(answer.contentEquals("yes")) 
		{JOptionPane.showMessageDialog(null, "Then you're gonna rule the world!");

		}
		if(answer.contentEquals("no")) 
		{JOptionPane.showMessageDialog(null, "Then sign up for classes at The League of Amazing Programmers, idiot!");

		// 2. If they say "yes", tell them they will rule the world
		// 3. Otherwise, tell them to sign up for classes at The League.

		}
	}
}