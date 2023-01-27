package Day1;
import java.util.Random;
import java.util.Scanner;
public class GuessNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Objective : Generate Random Number
		// Package : java.util
		// Method : nextInt(limit) : generates andom between 0 to limit
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
		System.out.println("Guess the number between 0 and 20");
		int userChoice = sc.nextInt();
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
		System.out.println("Computer Choice : "+computerChoice);
		
		//Guess the number
		
		
		
		
		if(userChoice > computerChoice) {
			System.out.println("Your guess is too high");
		} else if(userChoice < computerChoice) {
			System.out.println("Your guess is too low");
		} else {
			System.out.println("Gotcha! You guessed it right");
			break;
		}
		}
		

	}
}
