package strings;

public class MutableStringBuilder {

	public static void main(String[] args) {
		// can be initialized with capacity or char sequence. 
		StringBuffer sbuff = new StringBuffer(); 
		StringBuilder sbldr = new StringBuilder(); 
		System.out.println(sbuff.capacity()); // capacity - 16
		System.out.println(sbldr.capacity()); // capacity - 16

		StringBuffer sbuff2 = new StringBuffer(120); 
		StringBuilder sbldr2 = new StringBuilder(150); 
		System.out.println(sbuff2.capacity()); // capacity - 120
		System.out.println(sbldr2.capacity()); // capacity - 150
		
		

	}

}
