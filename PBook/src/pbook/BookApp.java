package pbook;

import java.util.Arrays;

public class BookApp {

	public static void main(String[] args) {
		Book book1=new Book("Rachel's Legacy Thomas","Julie");
		Book book2=new Book("Bulibasha Ihimaera","Witi");
		Book book3=new Book("Chappy Grace","Patricia");
		Book book4=new Book("Wild Pork and Watercress","Julie");
		Book book5=new Book("The invisible Mile","David");
		Book book6=new Book("Dad Art Wilkins","Damien");
		Book book7=new Book("The Antipodeans McGee","Greg");
		Book book8=new Book("Absence King","Joanna");
		
		Book[]books= {book1,book2,book3,book4,book5,book6,book7,book8};
		
		AuthorCompare ac=new AuthorCompare();
		Arrays.sort(books,ac);
		
		for(Book item:books) {
			System.out.println(item);
		}
		

	}

}
