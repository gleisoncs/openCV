package com.gtech.onepage.utils;

public enum States {
	MASSACHUSETTS("Massachusetts", "MA", ""), 
	MICHIGAN("Michigan", "MI", "");

	private final Object[] values;

	States(Object... vals) {
		values = vals;
	}

	public String FULL() {
		return (String) values[0];
	}

	public String ABBR() {
		return (String) values[1];
	}

	public boolean ORIGINAL_COLONY() {
		return (Boolean) values[2];
	}
	
	public static void main (String[] args) {
		System.out.println(States.valueOf("MICHIGAN").FULL());
	}
}