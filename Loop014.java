package com.looping.bll;
import java.util.Random;
import java.util.Scanner;
public class Loop014 {
		public static void main(String[] args)
		{
			int ans, guess;
			int MAX = 100;
			Scanner input = new Scanner(System.in);
			// Random obj
			Random rand = new Random();
			ans = rand.nextInt(MAX);
			System.out.println(ans);

			// loop for guess is correct
			boolean correct = false;
			while (!correct) {
				System.out.println("Guess a number between 1 and 100: ");
				guess = input.nextInt();
				// if guess is greater than actual
				if (guess > ans) {
					System.out.println("Too high, try again");
				}
				else if (guess < ans) {
					System.out.println("Too low, try again");
				}
				else {
					System.out.println("You guessed the Right number.");
					correct = true;
				}
			}
		}
}

