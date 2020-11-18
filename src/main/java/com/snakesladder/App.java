package com.snakesladder;

public class App 
{

    public static void main( String[] args )
    {
    	System.out.println( "Welcome to the Ladder-Snakes Game" );
        Player player= new Player();
    	player.position.add(0);
    	int number=player.RollTheDice();
    	System.out.println(number);
    	
    	int diceValue=player.OptionCheck(number);
    	player.position.add(diceValue);
    	System.out.println(player.position);
    }
}
