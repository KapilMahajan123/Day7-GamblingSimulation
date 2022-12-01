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
	     * As a Calculative Gambler if won or lost 50% of the stake, would resign for the day
	     */
	    public static final  int initialStake = 100;
	    public static final int stakeBet = 1;
	    public static final float percentage50 = (initialStake / 100) * 50;
		public static final float highestStake = percentage50 + initialStake;
		public static final float lowestStake = percentage50 - initialStake;
	    static Random random = new Random(); 

	    public static void main(String[] args)
	    {
	    	int totalStake = initialStake;
	    	//Printed
	    	System.out.println("Welcome to Gambling Game Simulator program");
	    	while(totalStake < highestStake && totalStake > lowestStake) {
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
	    	//It will get the bet is win or lose
	    	if(totalStake == highestStake)   
	    		System.out.println("Gambler won by: " +totalStake);
	    	else
	    		System.out.println("Gambler lost by: " +totalStake);
	 }  	

}
