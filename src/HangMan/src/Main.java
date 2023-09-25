// Bryce Thomson | Hangman Game | 09-18-2023

import java.util.Scanner;
import java.util.Random;

//Initialize variables for guess and target word
//create switch
//create hangman cases in switch
//create revealCharacter string

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordList[] = {"hangman", "desktop", "oranges"};
		Random rand = new Random();
		int randomInt = rand.nextInt(wordList.length);
		char userChar = sc.next().charAt(0);
		
		String targetWord = wordList[randomInt];
		char guessedChar = userChar;
		String guessedWord = displayHiddenWord(targetWord);
		
		guessedWord = revealCharacter(guessedChar, targetWord, guessedWord);
		System.out.println(guessedWord);
	}
	
	public static String displayHiddenWord(String targetWord) {
		int wordLength = targetWord.length();
		StringBuilder displayedWord = new StringBuilder();
		
		for (int i = 0; i < wordLength; i++) {
			displayedWord.append('-');
		}
		return displayedWord.toString();
	}


	public static void printHangMan(int guesses) {
		switch(guesses) {
		case 0 = 
				System.out.println("     0     ");
				
				break;
		case 1 =
				System.out.println("     0      ");
				System.out.println("     |      ");
				
				break;
		case 2 =
				System.out.println("     0       ");
				System.out.println("     |       ");
				System.out.println("     |       ");
				
				break;
		case 3 = 
				System.out.println("     0       ")
				System.out.println("     |       ")
				System.out.println("   --|--     ")
				System.out.println("     |       ")
				
				break;
		case 4 = 
				System.out.println("     0       ");
				System.out.println("     |       ");
				System.out.println("   --|--     ");
				System.out.println("     |       ");
				System.out.println("    / \\     ");
				System.out.println("   /   \\    ");
				
				break;
		}
	}
	public static String revealCharacter(char guess, String target, String revealed) {
		StringBuilder result = new StringBuilder(revealed);
		
		for (int i = 0; i < target.length(); i++) {
			if (target.charAt(i) == guess) {
				result.setCharAt(i, guess);
			}
		}
	}
	return result.toString();
}
