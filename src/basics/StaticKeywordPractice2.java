package basics;


class StaticDemo{
	
	static int staticNumber = 1; 
	int nonStaticNumber = 1_111; 
	
	static {
		System.out.println("----- Static Block -----");
		System.out.println("staticNumber : " + staticNumber);
		staticNumber = 11; 
		System.out.println("staticNumber : " + staticNumber);
		System.out.println("--- Static Block Ends ---");
	}
	
	{
		System.out.println("----- Non - Static Block -----");
		System.out.println("nonStaticNumber : " + nonStaticNumber);
		nonStaticNumber = 11_111; 
		System.out.println("nonStaticNumber : " + nonStaticNumber);
		System.out.println("----- Non - Static Block Ends -----");
	}
	
	public static void staticMethod() {
		System.out.println("----- Static method -----");
	}
	
	public void nonStaticMethod() {
		System.out.println("----- Non - Static method -----");
	}

}


public class StaticKeywordPractice2 {

	public static void main(String[] args) {
		System.out.println("Main Method.");
		
		StaticDemo d = new StaticDemo(); 
		System.out.println(StaticDemo.staticNumber);
		StaticDemo.staticMethod();
		System.out.println(d.nonStaticNumber);
		d.nonStaticMethod();
	}

}
