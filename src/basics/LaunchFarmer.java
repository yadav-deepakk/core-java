package basics;

import java.util.Scanner;

class Farmer{
	float principleAmt; 
	static float intrestRate; 
	float time; 
	float simpleIntrest; 
	
	static Scanner sc;  
	
	static {
		intrestRate = 12.0f;
		sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.println("Enter Principle Amount: ");
		this.principleAmt = sc.nextFloat();
		System.out.println("Enter time: ");
		this.time = sc.nextFloat(); 
	}
	
	public void computeSimpleIntrest() {
		this.simpleIntrest = this.principleAmt * this.time * intrestRate * 0.01f; 
	}
	
	public void displaySI() {
		System.out.println("Simple Intrest: " + simpleIntrest);
	}
}

public class LaunchFarmer {

	public static void main(String[] args) {
		Farmer farmer1 = new Farmer(); 
		Farmer farmer2 = new Farmer(); 
		
		farmer1.input();
		farmer2.input();
		
		farmer1.computeSimpleIntrest();
		farmer2.computeSimpleIntrest();
		
		farmer1.displaySI();
		farmer2.displaySI();
	}

}
