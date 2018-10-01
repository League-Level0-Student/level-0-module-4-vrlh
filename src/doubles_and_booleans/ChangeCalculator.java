package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "How many Nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int n = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many Dimes do you have?");
int d = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many Quarters do you have?");
int q = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double m = .05*n + .1*d + .25*q;
		// Tell the user how much money they have
JOptionPane.showInputDialog(null, "You have " + m + " dollars");
	}
}

