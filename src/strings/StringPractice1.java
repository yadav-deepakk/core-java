package strings;

public class StringPractice1 {

	public static void main(String[] args) {

		String s1 = "PW";
		String s2 = "PW";
		String s3 = new String("PW");
		String s4 = new String("PW");

		if (s1 == s2) {
			System.out.println("s1 and s2 are pointing to same string object");
		} else {
			System.out.println("s1 and s2 are not pointing to same string object");
		}
		if (s3 == s4) {
			System.out.println("s3 and s4 are pointing to same string object");
		} else {
			System.out.println("s3 and s4 are not pointing to same string object");
		}

		// comparing contents
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 have same content.");
		}
		if (s1.equals(s3)) {
			System.out.println("s1 and s3 have same content.");
		}
		if (s1.equals(s4)) {
			System.out.println("s1 and s4 have same content.");
		}
		if (s2.equals(s3)) {
			System.out.println("s2 and s3 have same content.");
		}
		if (s2.equals(s4)) {
			System.out.println("s2 and s3 have same content.");
		}
		if (s3.equals(s4)) {
			System.out.println("s3 and s4 have same content.");
		}

	}

}
