package com.amerigroup.screening.dice;

/**
 * <p>
 * An enum for  NumberOfSidesPerDie
 * </p>
 */

public enum NumberOfSidesPerDie {
	
	
        FOUR(4),
        SIX(6),
        EIGHT(8),
        TEN(10),
        TWELVE(12),
        TWENTY(20),
        HUNDERED(100);

        private final int value;

        NumberOfSidesPerDie( final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }


