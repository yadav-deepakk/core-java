package basics; 

public class StatickKeywordPractice {
	
	/*----------------------------------
	  Order at which execution happens 
	-----------------------------------*/
	// static variables 
	// static block 
	// static method 
	// non static (instance) variables
	// non static blocks 
	// non static methods
	
	
	
	// static variable 
	static int staticNumber;	// default value will be assigned as 0 at linking phase of class loading process. 
	
	// non - static variable
	int nonStaticNumber;
	
	// static block
	static {
		System.out.println("----- Static block -----");
		System.out.println("num : " + staticNumber); 
		staticNumber = 50; 
		System.out.println("num : " + staticNumber); 
		System.out.println("----- Static block ends-----\n");
	}
	
	
	// non - static block
	{
		System.out.println("----- Non static block -----");
		nonStaticNumber = 25; 
		System.out.println("---- Non static block ends ----\n");
	}
	
	
	// static method 
	public static void staticMethod() {
		System.out.println("--------- Static method ----------");
		System.out.println("Sample static method");
		System.out.println("------- Static method ends -------\n");

	}
	
	// non - static method 
	public void sampleMethod() {
		System.out.println("------- non static method ---------");
		System.out.println("Sample non - static method");
		System.out.println("----- non static method ends ------\n");

	}

	public static void main(String[] args) { 
		System.out.println("mainMethod"); 
		staticMethod(); 	
		
		StatickKeywordPractice obj = new StatickKeywordPractice(); 
		System.out.println("age : " + obj.nonStaticNumber);
	}

}
