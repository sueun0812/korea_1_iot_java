package chapter20.Livrary2.model;

public class Book {
	private String title;
	private String author;
	private boolean isBorrowed;	// 책의 대여 상태를 나타내는 필드 (false - 미대여)
	
	// 생성자
	public Book(String title, String author, boolean isBorrowed) {
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}

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

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	
	
	
}
