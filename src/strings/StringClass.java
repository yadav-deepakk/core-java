package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringClass {
	
	public static String reverseString(String str) {
		String reverseStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr + str.charAt(i); 
		}
		return reverseStr;
	}
	
	public static String reverseWords(String line) {
		String[] words = line.split(" ");
		String reverseLine = "";
		
		for (int i=words.length -1; i>=0; i--) {
			reverseLine = reverseLine + words[i] + " "; 
		}
		
		return reverseLine;
	}
	
	public static String reverseStringPreservePosition(String str) {
		String[] words = str.split(" ");
		String revStr = "";
		for(String w : words) {
			revStr = revStr + reverseString(w) + " ";
		}
		return revStr; 
	}

	public static boolean isPalindrom(String s) {
		boolean isPalindrom = true;
		for(int i=0;i<(s.length()-1)/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i -1)) {
				isPalindrom = false;
				break;
			}
		}
		return isPalindrom;
	}
	
	public static boolean isAnagram(String str1, String str2){
		if(str1.length()!=str2.length()) 
			return false;
		
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
				
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch) +1);
			}else {
				mp.put(ch, 1);
			}
		}
		
		for(int j=0; j<str2.length(); j++) {
			char c = str2.charAt(j);
			if(mp.containsKey(c) && mp.get(c)!=1) {
				mp.put(c, mp.get(c) -1);
			}else {
				mp.remove(c);
			}
		}

		return mp.size()>0 ? false:true;
	}
	
	public static boolean isPangram(String s){
		s = s.replace(" ", "").toLowerCase();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(mp.containsKey(ch)) {
					mp.put(ch, mp.get(ch) +1);
				}else {
					mp.put(ch, 1);
				}		
			}
		}
		//System.out.println(mp);
		return mp.size() == 26;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String s1 = sc.nextLine();
// 		String s2 = sc.nextLine();
//
//		System.out.println("Length of String s1 is: " + s1.length());								// length 
//		
//		System.out.println("First Character: " + s1.charAt(0));										// charAt
//		System.out.println("Last Character: " + s1.charAt(s1.length()-1));	
//		
//		System.out.println("" + s1.indexOf("l"));													// index checking
//		System.out.println("" + s1.lastIndexOf("l"));
//		
//		System.out.println("SubString formed from 1st to 3rd index: " + s1.substring(1,3));			// substring
//		System.out.println("SubString formed from 5th to 6th index: " + s1.substring(5,6));
//		
//		System.out.println("Sub-sequence formed from 1st to 4th index: " + s1.subSequence(1,4));	// sub sequence
//		
//		System.out.println("" + s1.compareTo("HelloWorld"));										// Comparison 
//		System.out.println("" + s1.compareTo("helloWorld"));
//		System.out.println("" + s1.compareToIgnoreCase("hello world"));
//		
//		System.out.println(reverseString(s1));
//		System.out.println(reverseWords(s1));
//		System.out.println(reverseStringPreservePosition(s1));
//		System.out.println(isPalindrom(s1));
// 		System.out.println(isAnagram(s1, s2));
		
		System.out.println(isPangram(s1));
		
		sc.close();
		
	}

}

// input: HelloWorld
