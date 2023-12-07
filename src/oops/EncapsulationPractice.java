package oops;

class Book {
	// data members 
	private String title;
	private String author;
	private int pageCount;
	private float price;

	
	// member methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void displayDetail() {
		System.out.println("---------------------------------");
		System.out.println("Book Name : " + this.title);
		System.out.println("Book Author : " + this.author);
		System.out.println("Book price : " + this.price + " INR");
		System.out.println("Book pageCount : " + this.pageCount);
		System.out.println("---------------------------------");
	}

}

// Encapsulation : binding data members and member methods into a single unit 
public class EncapsulationPractice {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("Rich Dad, Poor Dad");
		b1.setAuthor("Robert Kiyosaki");
		b1.setPrice(299.99f);
		b1.setPageCount(500);
		b1.displayDetail();
	}

}
