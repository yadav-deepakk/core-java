package datastructures;

import java.util.Scanner;

public class ArraysPractice {

	public static void reverseArray(int[] arr, int n) {
		System.out.println("Array after reversing it...");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + (i == n - 1 ? "\n" : " "));
		}
	}

	public static boolean isPalindorm(int arr[], int n) {
		boolean isPalindrome = true;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - i - 1]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isPalindrome = isPalindorm(arr, n);
		if (isPalindrome) {
			System.out.println("Entered Array is a palindrome.");
		} else {
			System.out.println("Entered Array is NOT a palindrome.");
		}
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] + arr[n - i - 1];
			arr[n - i - 1] = arr[i] - arr[n - i - 1];
			arr[i] = arr[i] - arr[n - i - 1];
		}
		System.out.println("Array after reversing it...");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + (i == n - 1 ? "\n" : " "));
		}
		reverseArray(arr, n);
		sc.close();
	}

}
