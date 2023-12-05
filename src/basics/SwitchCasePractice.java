package basics;

import java.util.Scanner;

public class SwitchCasePractice {
	
	static public boolean isNotAnAlphabet(char ch) {
		return ch<'a' || ch>'z';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		
		char ch;
		
		do {
			ch = sc.next().toLowerCase().charAt(0);
			if(isNotAnAlphabet(ch)) {
				System.out.println("Please enter a character from \'A\' to \'Z\'");
			}
		}while(isNotAnAlphabet(ch));
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("You have entered a \'vowel\'.");
				break;
			default: 
				System.out.print("You have entered a \'consonant\'.");
		}
		
		sc.close();

	}

}
