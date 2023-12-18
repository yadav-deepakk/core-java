package interfaces;

interface Organism {

	public void breath();

	public void reproduce();

	public void locomotion();
}

interface Animal extends Organism {
	public void jump();
}

class Kangaroo implements Animal {

	public void breath() {
		System.out.println("Kangaroo can breath, they have nose and lungs");
	}

	public void reproduce() {
		System.out.println("Kangaroo can reproduce their offsprings and keep babies in their pockets.");
	}

	public void locomotion() {
		System.out.println("Kangaroo can run they have legs.");
	}

	public void jump() {
		System.out.println("Kangaroo can jump.");
	}

}

public interface Interface2 {
	public static void main(String[] args) {
		Organism kangaroo = new Kangaroo();
		kangaroo.breath();
		kangaroo.reproduce();
		((Animal) kangaroo).jump();

	}
}
