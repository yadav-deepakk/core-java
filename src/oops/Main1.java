package oops;

class People {
	private String name;

	class Address {
		String city;
		String pinCode;

		public Address(String city, String pinCode) {
			this.city = city;
			this.pinCode = pinCode;
		}
	}

	public void displayName() {
		System.out.println("Name : " + this.name);
	}
}

public class Main1 {
	public static void main(String[] args) {
		People human1 = new People();
		People.Address humanAddr1 = human1.new Address("Mumbai", "101");
		human1.displayName();
		System.out.println(humanAddr1.city);
		System.out.println(humanAddr1.pinCode);
	}
}
