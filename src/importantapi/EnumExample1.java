package importantapi;

enum Result {
	PASS, FAIL, NR;

	Result() {
		System.out.println(this.ordinal() + ":" + this + ", result constructor called.");
	}

	public void printOrdinal() {
		System.out.println(this.ordinal());
	}

}

public class EnumExample1 {

	public static void main(String[] args) {
		Result res1 = Result.PASS;
		Result res2 = Result.FAIL;
		Result res3 = Result.NR;
		res1.printOrdinal();
		res2.printOrdinal();
		res3.printOrdinal();

		switch (res1) {
		case PASS:
			System.out.println("You have been PASS");
			break;

		case FAIL:
			System.out.println("You have been FAIL");
			break;

		case NR:
			System.out.println("Your result is not declared yet.");
			break;

		default:
			System.out.println("you did not appeared for exams.");
			break;
		}

	}

}
