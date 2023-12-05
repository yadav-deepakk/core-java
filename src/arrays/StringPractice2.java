package arrays;

import java.util.HashMap;
import java.util.Map;

public class StringPractice2 {

	public static String removeDuplicates(String str) {
		str = str.toLowerCase().replace(" ", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				continue;
			} else {
				map.put(c, 1);
				newStr = newStr + c;
			}
		}

		return newStr;

	}

	public static void displayDuplicates(String str) {
		str = str.toLowerCase().replace(" ", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String duplicates = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
				continue;
			}

			if (map.containsKey(c) && map.get(c) == 1) {
				duplicates = duplicates + c;
			} else {
				map.put(c, map.get(c));
			}
		}

		System.out.println(duplicates);
	}

	public static boolean isPalindromeString(String str) {
		str = str.toLowerCase().replace(" ", "");
		for (int i = 0; i < str.length() / 2; i++) {
			// first with last
			char f, l;
			f = str.charAt(i);
			l = str.charAt(str.length() - i - 1);
			if (f != l) {
				return false;
			}
		}

		return true;
	}

	public static void countVCS(String str) {
		int v = 0, c = 0, sp = 0;
		str = str.toLowerCase().replace(" ", "");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.println("Vowels: " + ch);
					v++;
				} else {
					System.out.println("Consonants: " + ch);
					c++;
				}
			} else {
				System.out.println("Special Character: " + ch);
				sp++;
			}
		}
		System.out.println("Vowels: " + v + ", Consonants: " + c + ", Special Characters: " + sp);
	}

	public static boolean isAnagramString(String str1, String str2) {
		str1 = str1.toLowerCase().replace(" ", "");
		str2 = str2.toLowerCase().replace(" ", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);

			// extra character in string 2nd
			if (!map.containsKey(ch)) {
				return false;
			}

			if (map.containsKey(ch) && map.get(ch) > 1) {
				map.put(ch, map.get(ch) - 1);
			} else if (map.containsKey(ch) && map.get(ch) == 1) {
				map.remove(ch);
			}
		}

		return map.size() == 0;
	}

	public static boolean isPangramString(String str) {
		str = str.toLowerCase().replace(" ", "");
		int chars[] = new int[26];
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) < 'a' || str.charAt(j) > 'z')
				continue;
			int index = (int) str.charAt(j) - 'a';
			chars[index]++;
//			System.out.println("index : " + index + " char: " + str.charAt(j));
		}

//		for (int j = 0; j < chars.length; j++) {
//			System.out.print((char)(j+'a') + ": " + chars[j] + ",");
//		}
//		System.out.println();

		for (int j = 0; j < chars.length; j++) {
			if (chars[j] < 1) {
				return false;
			}
		}

		return true;
	}

	public static boolean isAllUniqueChars(String str) {
		str = str.toLowerCase().replace(" ", "");
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				return false;
			} else {
				map.put(c, 1);
			}
		}
		return true;
	}

	public static char maxOccuringChar(String str) {
		str = str.toLowerCase().replace(" ", "");
		int chars[] = new int[256];
		char maxOccChar = '\u0000';

		for (char ch : str.toCharArray()) {
			chars[ch]++;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < chars.length; i++) {
			if (max < chars[i]) {
				max = chars[i];
				maxOccChar = (char) i;
			}
		}

		return maxOccChar;
	}

	public static void main(String[] args) {
		// Q1: program to remove duplicates.
//		System.out.println(removeDuplicates("aabbccd"));

		// Q2: program to print duplicates.
//		displayDuplicates("aabbccdef");

		// Q3: program to check palindrome.
//		System.out.println(isPalindromeString("Deepak")); 

		// Q4: program to count consonants, vowel, special character.
//		countVCS("The quick brown fox jumps over a lazy dog.");

		// Q5: program to check anagram.
//		System.out.println(isAnagramString("Silent", "Listen")); 

		// Q6: program to check pangram.
//		System.out.println(isPangramString("The quick brown fox jumps over a lazy dog."));

		// Q7: program to check if string contains all unique characters or not.
//		System.out.println(isAllUniqueChars("abca")); 

		// Q8: program to find maximum occurring character.
//		System.out.println(maxOccuringChar(""));
		
		String s = new String("Virat");
		s.concat("Kohli"); 
		System.out.println(s);

	}
	

}
