package com.amerigroup.screening.dice;

import java.util.Scanner;

public class IBrokenDiceRollerImplTest {

	public static void main(String[] args) {
		IDiceRoller obj = null;
		try {
			obj = (IDiceRoller) Class.forName("com.amerigroup.screening.dice.BrokenDiceRoller").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//IDiceRoller DiceRoller = new BrokenDiceRoller();
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the Number of Dices in Broken Dice code");
		int numberOfDice = s.nextInt();
		System.out.println("You entered Number as " + numberOfDice );
		System.out.println("Enter the sides of Number in Broken Dice code: ");
		int numberOfSidesPerDie = s.nextInt();
		System.out.println("You entered Number of sides per Die as " + numberOfSidesPerDie );
		System.out.println("Sum of the roll is " + obj.roll(numberOfDice, numberOfSidesPerDie));
		s.close();

	}

}
