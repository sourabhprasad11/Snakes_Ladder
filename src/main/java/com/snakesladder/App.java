package com.snakesladder;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Welcome to the Ladder-Snakes Game" );
        Player player= new Player();
    	player.position.add(0);
    	int number=player.RollTheDice();
    }
}
