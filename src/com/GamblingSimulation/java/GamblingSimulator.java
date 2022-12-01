package com.GamblingSimulation.java;

import java.util.Random;

/**
 * 
 * @author Kapil
 *
 */
public class GamblingSimulator {
		
	    /**
	     * starting with a stake of $100 every day and bet $1 every game.
	     * Genrate a random in static 
	     * make $1 bet so either win or loose $1
	     */
	    public static final  int initialStake = 100;
	    public static final int stakeBet = 1;
	    static Random random = new Random(); 

	    public static void main(String[] args)
	    {
	    	int totalStake = initialStake;
	    	//Printed
	    	System.out.println("Welcome to Gambling Game Simulator program");
	    	int play = random.nextInt(2);     //Genrate random Numbers in range 0,1
	    	
	    	switch(play)
	    	{
	    	case 0:
	    			totalStake = totalStake - stakeBet;
	    			System.out.println("Stake after loosing: "+totalStake);    //print result
	    			break;
	    	case 1:
	    			totalStake = totalStake + stakeBet;
	    			System.out.println("Stake after winning: "+totalStake);
	    			break;
	    	}
	        
	    }

}
