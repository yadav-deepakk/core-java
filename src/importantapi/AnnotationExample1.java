package importantapi;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {

	public int totalRuns() default 20000;

	public String country() default "INDIA";
}

@CricketPlayer(country = "India", totalRuns = 20000)
class ViratKohli {
	private int age;
	private int totalInnings;
	private int strikeRate;

	public ViratKohli() {
		System.out.println(this.getClass().getSimpleName() + ", Constructor Invoked!!!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotalInnings() {
		return totalInnings;
	}

	public void setTotalInnings(int totalInnings) {
		this.totalInnings = totalInnings;
	}

	public int getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(int strikeRate) {
		this.strikeRate = strikeRate;
	}

	@Override
	public String toString() {
		return "ViratKohli [age=" + age + ", totalInnings=" + totalInnings + ", strikeRate=" + strikeRate + "]";
	}

}

public class AnnotationExample1 {

	public static void main(String[] args) {
		ViratKohli v = new ViratKohli();
		v.setAge(32);
		v.setTotalInnings(300);
		v.setStrikeRate(101);

		System.out.println(v);

		Class c = v.getClass();
		Annotation a = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer) a;

		String playerCountry = cp.country(); 
		int playerRuns = cp.totalRuns(); 
		System.out.println(playerCountry);
		System.out.println(playerRuns);

	}

}
