package datatypes;

public class TypeConversion {
	
	public static void main(String args[]) {
		/*---------------------
		 * Implicit Conversion 
		 *---------------------*/
		int int_num1 = 23/4;
		int int_num2 = 100;
		long long_num = int_num2;
		float float_num = long_num;
		double double_num = float_num;
		
		System.out.println(int_num1);
		System.out.println(int_num2);
		System.out.println(long_num);
		System.out.println(float_num);
		System.out.println(double_num);

		
		/*---------------------
		 * Explicit Conversion 
		 *---------------------*/
		float float_num1 = (float) 22/6;
		System.out.println(float_num1);
	}
	
}
