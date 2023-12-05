package arrays;

import java.util.Scanner;

public class Student {
	
	public static double calPercentage(int marks[]) {
		int sum = 0;
		for(int m : marks) {
			sum+=m;
		}
		return (sum)/marks.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
				
		System.out.println("Enter marks for 5 subjects: ");
		for(int i=0; i<5; i++) {
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Percentage is: " + calPercentage(marks));
		sc.close();
	}

}
