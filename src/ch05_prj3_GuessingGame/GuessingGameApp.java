package ch05_prj3_GuessingGame;

import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y"));
		
		System.out.println("Enter number: ");
		
		
		int number = generateRandomNumber(); //call method
		boolean correctGuess = false;
		while (!correctGuess) {
		int guess = getIntWithinRange(sc, "Enter number: ", 1, 100);
		int diff = guess - number;
		if (diff <= -10) {
			System.out.println("Way too low!");
		}
		else if (diff >= 10) {
			System.out.println("Way too high!");
		}
		else if (diff < 0) {
			System.out.println("Too low!");
		}
		else if (diff > 0) {
			System.out.println("Too high!");
		}
	    
		}
		
		sc.close();
		System.out.println("Bye!");
	

	}

	private static int generateRandomNumber() {
		System.out.println("I'm thinking of a number from 1 to 100.\n Try to guess it.");
		int random = (int)(Math.random()*100)+1;
		System.out.println("* random # = "+random);
		return random;
	}
	
	
	private static int getInt(Scanner sc, String prompt)  {
		int guessNumber = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				guessNumber = sc.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Error... please enter a valid integer");
				sc.nextLine();
			}
		}
		return guessNumber;
	}
	
	private static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int guessNumber = 0;
		boolean isValid = false;
		while (!isValid) {
			guessNumber = getInt(sc, prompt);
			if (guessNumber >= min)
				isValid = true;
				else {
					System.out.println("Error.. number must be greater than the minimum");
			continue;
		}
		if (guessNumber <= max)
			isValid = true;
		else {
			System.out.println("Error.. number must be less than "+(max+1));
		}
		}
		return guessNumber;
	}
	
	
	
}

