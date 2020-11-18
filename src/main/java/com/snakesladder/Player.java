package com.snakesladder;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Integer> position= new ArrayList<Integer>();
	
	int RollTheDice() {
		int number= (int)(Math.floor(Math.random()*10)%6+1);
		return number;
	}
}
