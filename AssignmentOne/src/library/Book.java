package library;

public class Book {

	private int bookId;
	private String bookName;
	private String title;
	private boolean availability;
	private String author;
	private int price;

	public Book() {

	}

	public Book(int bookId, String bookName, String title,
			boolean availability, String author, int price) {

		this.bookId = bookId;
		this.bookName = bookName;
		this.title = title;
		this.availability = availability;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", title="
				+ title + ", availability=" + availability + ", author="
				+ author + ", price=" + price + "]";
	}

}
