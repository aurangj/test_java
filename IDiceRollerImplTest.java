package com.amerigroup.screening.dice;

import java.util.Scanner;

/**
 * <p>
 * An class for  which will test the implementation of IDiceRoller
 * </p>
 */

public class IDiceRollerImplTest {
	public static void main(String[] args)
	{
		IDiceRollerImpl DiceRoller = new IDiceRollerImpl();
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the Number of Dices");
		int numberOfDice = s.nextInt();
		System.out.println("You entered Number of dice as " + numberOfDice );
		System.out.println("Enter the sides of Number: ");
		int numberOfSidesPerDie = s.nextInt();
		System.out.println("You entered Number of sides per Dice as " + numberOfSidesPerDie );
		System.out.println("Sum of the roll is " + DiceRoller.roll(numberOfDice, numberOfSidesPerDie));
		s.close();
		
	}

}
