package exceptionhandling;

public class ExceptionPractice {

	public static void main(String[] args) {
		boolean isErrorOccured = false;
		System.out.println("Program Started...");
		try {
			int n1=0;
			int n2=10;
			
			if(n2<18) {
				throw new Exception("Invalid Age!!!");
			}
			
			int res = n2/n1;
			System.out.println(res);
		}catch(Exception ex){
			System.out.println("Error occured.");
		    isErrorOccured = true;
		    ex.printStackTrace(System.out);
		}finally {
			if(isErrorOccured) {
				System.out.println("Error exists in the program.");
			}else {
				System.out.println("No Error occured in program.");
			}
		}
		System.out.println("Program Terminated...");
	}

}
