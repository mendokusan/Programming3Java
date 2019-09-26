package pcollections;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
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
	
	public String toString() {
		return title + " " + author;
	}

	@Override
	public int compareTo(Book book1) {
		// TODO Auto-generated method stub
		
		
		if(this.getTitle().equals(book1.getTitle()))
			return this.author.compareTo(book1.getAuthor());
		
		else {
			return this.title.compareTo(book1.getTitle());
		}

				
		

		}
	

}
