package com.amerigroup.screening.dice;

import java.util.Random;

/**
 * <p>
 * An class for  which implements Interface DiceRoller.
 * Simulates rolling one or
 * more polyhedral dice, like those used in Dungeons &
 * Dragons.
 * </p>
 */



public class IDiceRollerImpl implements IDiceRoller {
	
	NumberOfSidesPerDie num;

	@Override
	public int roll(int numberOfDice, int numberOfSidesPerDie)
			throws IllegalArgumentException {
		
		ValidateInputparams(numberOfDice, numberOfSidesPerDie);
		int sum = 0 ;	
		
		for (int i = 1 ;i <= numberOfDice; i++)
		{
			Random rand = new Random();
			int  n = rand.nextInt(numberOfSidesPerDie) + 1;
			sum = sum + n;
		}
		
		
		return sum;
	}
	
	/** Validates the input parameter and throws appropriate exception if
	 * number of dices is less than 1 and sides not 
	 * @param numberOfDice
	 * @param numberOfSidesPerDie
	 * @return None
	 * @throws IllegalArgumentException if either of the
	 *             passed in parameters is invalid
	
	 */
	private void ValidateInputparams(int numberOfDice, int numberOfSidesPerDie) throws IllegalArgumentException 
	{
		boolean test = false;
		if (numberOfDice < 1 )
		{
			throw new IllegalArgumentException("Number of dice should be Positive Integer");
		}
		for (NumberOfSidesPerDie n: NumberOfSidesPerDie.values())
			
		{
			if (n.getValue() == numberOfSidesPerDie)
			{
			   test = true;	
			}
		}
		if (!test)
		{
			throw new IllegalArgumentException("Number of sides of Dice should be either 4/6/8/10/12/20/100 only");
		}
	}

}
