package com.snakesladder;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Integer> position= new ArrayList<Integer>();

	int RollTheDice() {
		int number= (int)(Math.floor(Math.random()*10)%6+1);
		return number;
	}
	
	int OptionCheck(int number) {
		int option= (int)(Math.floor(Math.random()*10)%3+1);
		Player playernumber= new Player();
		switch(option) {
		case 1: 
			System.out.println( "No change in the position" );
			number=0;
			break;
		case 2:
			System.out.println( "Ladder Comes" );
			number=number+0;
			break;
		case 3:
			System.out.println( "Snake Comes" );
			number=0-number;
			break;
		default:
			System.out.println( "Error: Value not found" );
		}
		return number;
	}
	
}
