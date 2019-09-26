package pcollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		ArrayList<String> myCollection= new ArrayList<>();
		myCollection.add("i");
		myCollection.add("saw");
		myCollection.add("i");
		myCollection.add("conquered");
		
		HashSet<String>myhashset=new HashSet<String>(myCollection);
		System.out.println(myhashset);
		
		LinkedHashSet<String>linkedhashset=new LinkedHashSet(myCollection);
		
		System.out.println(linkedhashset);
		
		TreeSet<String>treeset=new TreeSet(myCollection);
		
		System.out.println(treeset);
		
		ArrayList<String> myCollection2= new ArrayList<>();
		myCollection2.add("came");
		myCollection2.add("i");
		myCollection2.add("saw");
		myCollection2.add("i");
		myCollection2.add("ran");
		myCollection2.add("away");
		
		TreeSet<String>treeset2=new TreeSet(myCollection2);
		System.out.println(treeset2);
		
		System.out.println(myCollection.containsAll(myCollection2));
		
		Set<String> intersection=new TreeSet<String>(myCollection);
		intersection.retainAll(myCollection2);
		System.out.println(intersection);
		
		Set<String> union=new TreeSet<String>(myCollection);
		union.addAll(myCollection2);
		System.out.println(union);
		
		Set<String> difference=new TreeSet<String>(myCollection);
		difference.removeAll(myCollection2);
		System.out.println(difference);
		
		ArrayList<Book> bookcollection=new ArrayList<Book>();

		Book b1 = new Book("Rachel's Legacy Thomas","Julie");
		Book b2=new Book("Bulibasha Ihimaera","Witi");
		Book b3=new Book("Chappy Grace","Patricia");
		Book b4=new Book("Wild Pork and Watercress","Julie");
		Book b5=new Book("The invisible Mile","David");
		Book b6=new Book("Dad Art Wilkins","Damien");
		Book b7=new Book("The Antipodeans McGee","Greg");
		Book b8=new Book("Absence King","Joanna");
		Book b9=new Book("Taken","O'Callagan Sue");
		Book b10=new Book("Taken","Crais Robert");
		TreeSet<Book> books=new TreeSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
		books.add(b8);
		books.add(b9);
		books.add(b10);
		
		
		System.out.println(books);
		
		Map<String,Integer> vechiles=new TreeMap<String,Integer>();
		vechiles.put("Datsun", 2);
		vechiles.put("Holden", 3);
		vechiles.put("Toyota", 4);
		vechiles.put("Suzuki", 1);
		
		System.out.println(vechiles);
		
		System.out.println("List of vechile types:");
		for(String key:vechiles.keySet())
		{
			System.out.println(key);
		}
		
		
		System.out.println("summarize:");
		
		int num=0;
		
		for(int value:vechiles.values())
		{
			num=num+1;
		}
		System.out.println(num);
		
		
		boolean present;
		
		String input=JOptionPane.showInputDialog("Which vechile would you like information on?");
			System.out.println(vechiles.get(input));
		
		
		
		
		
		


		
		

		

	}

}
