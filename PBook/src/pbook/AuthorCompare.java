package pbook;

import java.util.Comparator;

public class AuthorCompare implements Comparator<Book> {

	@Override
	public int compare(Book book1,Book book2) {
		if(book1.getAuthor()==null&&book2.getAuthor()==null)
			return 0;
		if(book1.getAuthor()==null)
		return 1;
		if(book2.getAuthor()==null)
		return -1;
		
		return book1.getAuthor().compareTo(book2.getAuthor());
	}
}
