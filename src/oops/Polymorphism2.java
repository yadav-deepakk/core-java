package oops;

class Bird extends Object {
	public void fly() {
		System.out.println("Birds can fly");
	}

	public void hunt() {
		System.out.println("Birds either hunt or eats grains or they do both.");
	}
}

class Eagle extends Bird {
	public void fly() {
		System.out.println("Eagle can fly at heigher heights.");
	}

	public void hunt() {
		System.out.println("Eagles hunt small and medium size animals.");
	}
}

class Sparrow extends Bird {
	public void fly() {
		System.out.println("Sparrow can fly at low height");
	}

	public void hunt() {
		System.out.println("Sparrow eats grains and catching insects, larvae etc.");
	}
}

class HummingBird extends Bird{
	public void fly() {
		System.out.println("HummingBirds fly at very low height.");
	}

	public void hunt() {
		System.out.println("HummingBirds rely on flower nector.");
	}
}

class BirdRef {
	public BirdRef() {
	}

	public void behavior(Bird bird) {
		bird.fly();
		bird.hunt();
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Bird eagle = new Eagle(); 
		Bird sparrow = new Sparrow(); 
		Bird hummingBird = new HummingBird();
		
		BirdRef bird = new BirdRef(); 
		bird.behavior(eagle);
		bird.behavior(sparrow);
		bird.behavior(hummingBird);
	}

}
