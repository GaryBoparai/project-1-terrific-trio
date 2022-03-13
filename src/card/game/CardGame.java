
package card.game;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		// this is for two players
		
		/*
		 * p1 stands for player 1
		 * pg1 stands for gender of player 1
		 * pa1 stands for age of player 1
		 */
		System.out.print("Enter name of player 1: ");
		String p1= input.nextLine();
		System.out.print("Enter gender of player 1: ");
		String pg1= input.nextLine();
		System.out.print("Enter age of player 1: ");
		int pa1= input.nextInt();
		/*
		 * p2 stands for player 2
		 * pg2 stands for gender of player 2
		 * pa2 stands for age of player 2
		 */
		System.out.print("Enter name of player 2: ");
		String p2= input.nextLine();
		System.out.print("Enter gender of player 2: ");
		String pg2= input.nextLine();
		System.out.print("Enter age of player 2: ");
		int pa2= input.nextInt();
	       Random random = new Random();

	        System.out.println("Here are the cards in the hand");
	        System.out.println("Pick a suit for your card");
	        int suit = input.nextInt();

	        System.out.println("Enter a value (1 to 13)");
	        int value = input.nextInt();

	        boolean match = false;
	        String response = match ? "Right guess": "No match";
	        
	        System.out.println(response);
	   
	   }
	}

